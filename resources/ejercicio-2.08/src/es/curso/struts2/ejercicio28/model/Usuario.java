package es.curso.struts2.ejercicio28.model;

import java.util.Date;

public class Usuario implements Cloneable {

	private String username;
	private String password;
	private String nombre;
	private String apellidos;
	private Date feNacimiento;
	private String direccion;
	private Telefono telefono;

	public Usuario() {
	}

	public Usuario(String username, String password, String nombre,
			String apellidos, Date feNacimiento, String direccion,
			String telefono) {
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.feNacimiento = feNacimiento;
		this.direccion = direccion;
		this.telefono = new Telefono(telefono);
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

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
