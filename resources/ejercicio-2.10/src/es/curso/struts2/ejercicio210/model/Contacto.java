package es.curso.struts2.ejercicio210.model;

import java.util.Date;

public class Contacto implements Cloneable {

	private String email;
	private String nombre;
	private String apellidos;
	private Date feNacimiento;
	private String direccion;
	private Telefono telefono1;
	private Telefono telefono2;

	private Usuario usuario;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getFeNacimiento() {
		return feNacimiento;
	}

	public void setFeNacimiento(Date feNacimiento) {
		this.feNacimiento = feNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Telefono getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(Telefono telefono1) {
		this.telefono1 = telefono1;
	}

	public Telefono getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(Telefono telefono2) {
		this.telefono2 = telefono2;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return 31 * 1 + ((email == null) ? 0 : email.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
