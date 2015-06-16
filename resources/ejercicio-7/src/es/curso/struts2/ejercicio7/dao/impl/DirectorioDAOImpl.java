package es.curso.struts2.ejercicio7.dao.impl;

import static es.curso.struts2.ejercicio7.model.TipoDirectorio.INBOX;
import static es.curso.struts2.ejercicio7.model.TipoDirectorio.SENT;
import static es.curso.struts2.ejercicio7.model.TipoDirectorio.TRASH;
import static es.curso.struts2.ejercicio7.utils.Constantes.DOMINIO;
import static org.apache.commons.lang.StringUtils.isNotBlank;
import static org.apache.commons.lang.StringUtils.split;
import static org.apache.commons.lang.StringUtils.substringBefore;
import static org.apache.commons.lang.StringUtils.trim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import es.curso.struts2.ejercicio7.dao.DirectorioDAO;
import es.curso.struts2.ejercicio7.model.Directorio;
import es.curso.struts2.ejercicio7.model.Mensaje;
import es.curso.struts2.ejercicio7.model.TipoDirectorio;
import es.curso.struts2.ejercicio7.model.Usuario;

public class DirectorioDAOImpl implements DirectorioDAO {

	private long nextId = 1;
	private Map<Usuario, Map<TipoDirectorio, Directorio>> mapDirectorios = new HashMap<Usuario, Map<TipoDirectorio, Directorio>>();

	private DirectorioDAOImpl() {
	}

	private static DirectorioDAO directorioDAO = new DirectorioDAOImpl();

	public static DirectorioDAO getInstance() {
		return directorioDAO;
	}

	@Override
	public Map<TipoDirectorio, Directorio> list(Usuario usuario) {
		return mapDirectorios.get(usuario);
	}

	public void saveAll(Set<Directorio> directorios, Usuario usuario) {
		Map<TipoDirectorio, Directorio> mapDirectorio = new LinkedHashMap<TipoDirectorio, Directorio>();
		for (Directorio directorio : directorios) {
			if (directorio.getId() == null) {
				directorio.setId(nextId++);
			}

			if (directorio.getUsuario() == null) {
				directorio.setUsuario(usuario);
			} else if (!directorio.getUsuario().equals(usuario)) {
				throw new UnsupportedOperationException("El usuario " + usuario
						+ " no puede guardar el directorio " + directorio);
			}
			mapDirectorio.put(directorio.getTipo(), directorio);
		}

		this.mapDirectorios.put(usuario, mapDirectorio);
	}

	@Override
	public void enviarMensaje(Mensaje mensaje, Usuario usuario) {
		mensaje.setDate(new Date());
		if (usuario != null) {
			mensaje.setFrom(usuario.getUsername() + DOMINIO);
		}

		Collection<Usuario> to = getDestinatarios(mensaje.getTo());
		for (Usuario destinatario : to) {
			if (mapDirectorios.containsKey(destinatario)) {
				Directorio inbox = mapDirectorios.get(destinatario).get(INBOX);
				Mensaje clone = (Mensaje) mensaje.clone();
				clone.setBcc(null);
				mensajeDAO.save(clone, inbox);
			}
		}
		
		Collection<Usuario> cc = getDestinatarios(mensaje.getCc());
		for (Usuario destinatario : cc) {
			if (mapDirectorios.containsKey(destinatario)) {
				Directorio inbox = mapDirectorios.get(destinatario).get(INBOX);
				Mensaje clone = (Mensaje) mensaje.clone();
				clone.setBcc(null);
				mensajeDAO.save(clone, inbox);				
			}
		}		

		Collection<Usuario> bcc = getDestinatarios(mensaje.getBcc());
		for (Usuario destinatario : bcc) {
			if (mapDirectorios.containsKey(destinatario)) {
				Directorio inbox = mapDirectorios.get(destinatario).get(INBOX);
				mensajeDAO.save((Mensaje) mensaje.clone(), inbox);
			}
		}

		if (mapDirectorios.containsKey(usuario)) {
			Directorio sent = this.mapDirectorios.get(usuario).get(SENT);
			mensajeDAO.save(mensaje, sent);
		}
	}

	private Collection<Usuario> getDestinatarios(String destinatario) {
		Collection<Usuario> destinatarios = new ArrayList<Usuario>();
		if (isNotBlank(destinatario)) {
			for (String to : split(destinatario, ",")) {
				String username = trim(substringBefore(to, "@"));
				destinatarios.add(new Usuario(username));
			}
		}
		return destinatarios;
	}

	@Override
	public void eliminarMensaje(Long id, Usuario usuario, TipoDirectorio tipo) {
		if (id == null || !mapDirectorios.containsKey(usuario) || tipo == null) {
			throw new UnsupportedOperationException("El usuario " + usuario
					+ " no puede eliminar el mensaje " + id
					+ " del directorio " + tipo);
		}

		Mensaje mensaje = null;
		Directorio directorio = mapDirectorios.get(usuario).get(tipo);
		for (Mensaje original : directorio.getMensajes()) {
			if (original.getId().equals(id)) {
				mensaje = original;
				break;
			}
		}

		Directorio trash = mapDirectorios.get(usuario).get(TRASH);
		if (TRASH.equals(tipo)) {
			mensajeDAO.delete(mensaje, trash);
		} else {
			mensajeDAO.move(mensaje, directorio, trash);
		}
	}

	@Override
	public Mensaje readMensaje(Long id, Usuario usuario, TipoDirectorio tipo) {
		if (id == null || !mapDirectorios.containsKey(usuario) || tipo == null) {
			throw new UnsupportedOperationException("El usuario " + usuario
					+ " no puede eliminar el mensaje " + id
					+ " del directorio " + tipo);
		}

		Mensaje mensaje = null;
		Directorio directorio = mapDirectorios.get(usuario).get(tipo);
		for (Mensaje original : directorio.getMensajes()) {
			if (original.getId().equals(id)) {
				original.setLeido(true);
				mensaje = (Mensaje) original.clone();
				break;
			}
		}

		return mensaje;
	}

	private MensajeDAOImpl mensajeDAO = MensajeDAOImpl.getInstance();
}
