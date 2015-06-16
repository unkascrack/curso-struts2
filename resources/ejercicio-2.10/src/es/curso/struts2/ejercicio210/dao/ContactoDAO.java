package es.curso.struts2.ejercicio210.dao;

import java.util.Collection;
import java.util.LinkedList;

import es.curso.struts2.ejercicio210.model.Contacto;
import es.curso.struts2.ejercicio210.model.Usuario;

public class ContactoDAO {

	private static ContactoDAO contactoDAO = new ContactoDAO();

	private ContactoDAO() {
	}

	public static ContactoDAO getInstance() {
		return contactoDAO;
	}

	public Collection<Contacto> listado(Usuario usuario) {
		return new LinkedList<Contacto>(usuario.getContactos());
	}

	public void alta(Contacto contacto, Usuario usuario) {
		if (usuario.getContactos().contains(contacto)) {
			throw new RuntimeException("El contacto inicado ya existe.");
		}
		usuario.addContacto(contacto);
	}

	public Contacto editar(String email, Usuario usuario) {
		Contacto original = getContacto(email, usuario);
		try {
			return (Contacto) (original != null ? original.clone() : null);
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public void modificar(Contacto contacto, Usuario usuario) {
		Contacto original = getContacto(contacto.getEmail(), usuario);
		if (original != null) {
			original.setNombre(contacto.getNombre());
			original.setApellidos(contacto.getApellidos());
			original.setFeNacimiento(contacto.getFeNacimiento());
			original.setTelefono1(contacto.getTelefono1());
			original.setTelefono2(contacto.getTelefono2());
		}
	}

	public void eliminar(Contacto contacto, Usuario usuario) {
		Contacto original = getContacto(contacto.getEmail(), usuario);
		if (original != null) {
			original.setUsuario(null);
			usuario.getContactos().remove(original);
		}
	}

	private Contacto getContacto(String email, Usuario usuario) {
		Contacto contacto = null;
		for (Contacto aux : usuario.getContactos()) {
			if (aux.getEmail().equals(email)) {
				contacto = aux;
				break;
			}
		}
		return contacto;
	}
}
