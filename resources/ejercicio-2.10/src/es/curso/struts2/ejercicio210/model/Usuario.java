package es.curso.struts2.ejercicio210.model;

import java.util.Collection;
import java.util.LinkedList;

public class Usuario implements Cloneable {

	private String username;
	private String password;
	private String nombre;

	private Collection<Contacto> contactos = new LinkedList<Contacto>();

	public Usuario() {
	}

	public Usuario(String username, String password, String nombre) {
		this.username = username;
		this.password = password;
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(Collection<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void addContacto(Contacto contacto) {
		contacto.setUsuario(this);
		this.contactos.add(contacto);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
