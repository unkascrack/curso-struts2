package es.curso.struts2.ejercicio7.dao.impl;

import static es.curso.struts2.ejercicio7.model.TipoDirectorio.INBOX;
import static es.curso.struts2.ejercicio7.model.TipoDirectorio.SENT;
import static es.curso.struts2.ejercicio7.model.TipoDirectorio.TRASH;
import static es.curso.struts2.ejercicio7.utils.Constantes.DOMINIO;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import es.curso.struts2.ejercicio7.dao.DirectorioDAO;
import es.curso.struts2.ejercicio7.dao.UsuarioDAO;
import es.curso.struts2.ejercicio7.model.Directorio;
import es.curso.struts2.ejercicio7.model.Mensaje;
import es.curso.struts2.ejercicio7.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

	private UsuarioDAOImpl() {
		Usuario usuario = new Usuario();
		usuario.setNombre("admin");
		usuario.setApellidos("admin");
		usuario.setUsername("admin");
		usuario.setPassword("admin");
		save(usuario);
	}

	private static UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

	public static UsuarioDAO getInstance() {
		return usuarioDAO;
	}

	@Override
	public Usuario buscarUsername(String username) {
		return usuarios.get(username);
	}

	@Override
	public void save(Usuario usuario) {
		usuarios.put(usuario.getUsername(), usuario);
		if (usuario.getDirectorios().isEmpty()) {
			Set<Directorio> directorios = new LinkedHashSet<Directorio>();
			Directorio inbox = new Directorio(usuario, INBOX);
			directorios.add(inbox);
			directorios.add(new Directorio(usuario, SENT));
			directorios.add(new Directorio(usuario, TRASH));
			directorioDAO.saveAll(directorios, usuario);
			usuario.setDirectorios(directorios);

			Mensaje bienvenida = new Mensaje();
			bienvenida.setFrom("noreply" + DOMINIO);
			bienvenida.setTo(usuario.getUsername() + DOMINIO);
			bienvenida.setSubject("Mensaje Bienvenida");
			bienvenida.setText("Mensaje Bienvenida");
			bienvenida.setDirectorio(inbox);
			directorioDAO.enviarMensaje(bienvenida, null);
		}
	}

	private DirectorioDAO directorioDAO = DirectorioDAOImpl.getInstance();
}
