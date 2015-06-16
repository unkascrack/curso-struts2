package es.curso.struts2.ejercicio7.model;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import static es.curso.struts2.ejercicio7.utils.Constantes.*;

public class Usuario extends ModelBase {

	private String username;
	private String password;
	private String nombre;
	private String apellidos;

	private Set<Directorio> directorios = new LinkedHashSet<Directorio>();
	private Set<Contacto> contactos = new LinkedHashSet<Contacto>();

	public Usuario() {
	}

	public Usuario(String username) {
		this.username = StringUtils.lowerCase(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = StringUtils.lowerCase(username);
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Set<Directorio> getDirectorios() {
		return directorios;
	}

	public void setDirectorios(Set<Directorio> directorios) {
		this.directorios = directorios;
	}

	public Set<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}

	@Override
	public boolean equals(Object o) {
		boolean equals = false;
		if (o == this) {
			equals = true;
		} else if (o != null && o instanceof Usuario) {
			Usuario usuario = (Usuario) o;
			equals = usuario.getUsername().equalsIgnoreCase(getUsername());
		}
		return equals;
	}

	@Override
	public int hashCode() {
		return 31 + ((username == null) ? 0 : username.hashCode());
	}

	@Override
	public String toString() {
		return String.format("[%s" + DOMINIO + "] %s %s", username, nombre,
				apellidos);
	}

}
