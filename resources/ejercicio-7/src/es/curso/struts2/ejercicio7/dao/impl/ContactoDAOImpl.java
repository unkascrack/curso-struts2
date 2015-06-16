package es.curso.struts2.ejercicio7.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import es.curso.struts2.ejercicio7.dao.ContactoDAO;
import es.curso.struts2.ejercicio7.model.Contacto;
import es.curso.struts2.ejercicio7.model.Usuario;

public class ContactoDAOImpl implements ContactoDAO {

	private long nextId = 1;
	private Map<Long, Contacto> mapContactos = new HashMap<Long, Contacto>();

	private ContactoDAOImpl() {
	}

	private static ContactoDAO contactoDAO = new ContactoDAOImpl();

	public static ContactoDAO getInstance() {
		return contactoDAO;
	}

	@Override
	public Contacto buscarEmail(String email, Usuario usuario) {
		Contacto contacto = null;

		for (Contacto aux : this.mapContactos.values()) {
			if (aux.getEmail().equalsIgnoreCase(email)
					&& aux.getUsuario().equals(usuario)) {
				contacto = aux;
				break;
			}
		}
		return contacto;
	}

	@Override
	public void delete(Long id, Usuario usuario) {
		Contacto contacto = this.mapContactos.get(id);
		if (contacto == null || !contacto.getUsuario().equals(usuario)) {
			throw new UnsupportedOperationException("El usuario " + usuario
					+ " no puede eliminar el contacto: " + contacto);
		}
		this.mapContactos.remove(id);
	}

	@Override
	public Collection<Contacto> list(Usuario usuario) {
		Collection<Contacto> contactos = new ArrayList<Contacto>();
		for (Contacto contacto : this.mapContactos.values()) {
			if (contacto.getUsuario().equals(usuario)) {
				contactos.add(contacto);
			}
		}
		return contactos;
	}

	@Override
	public void save(Contacto contacto, Usuario usuario) {
		if (contacto.getId() == null) {
			contacto.setId(nextId++);
		}
		if (contacto.getUsuario() == null) {
			contacto.setUsuario(usuario);
		} else if (!contacto.getUsuario().equals(usuario)) {
			throw new UnsupportedOperationException("El usuario " + usuario
					+ " no puede guardar el contacto " + contacto);
		}
		this.mapContactos.put(contacto.getId(), contacto);
	}

	@Override
	public Contacto read(Long id, Usuario usuario) {
		Contacto contacto = this.mapContactos.get(id);
		if (contacto == null || !contacto.getUsuario().equals(usuario)) {
			throw new UnsupportedOperationException("El usuario " + usuario
					+ " no puede leer el contacto " + contacto);
		}
		return contacto;
	}

}
