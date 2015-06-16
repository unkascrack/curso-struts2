package es.curso.struts2.ejercicio7.model;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class Contacto extends ModelBase {

	private String email;	
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;

	private Usuario usuario;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = StringUtils.lowerCase(email);
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean equals(Object o) {
		boolean equals = false;
		if (o == this) {
			equals = true;
		} else if (o != null && o instanceof Contacto) {
			Contacto contacto = (Contacto) o;
			equals = contacto.getEmail().equalsIgnoreCase(getEmail());
		}
		return equals;
	}

	@Override
	public int hashCode() {
		return 31 + ((email == null) ? 0 : email.hashCode());
	}
}
