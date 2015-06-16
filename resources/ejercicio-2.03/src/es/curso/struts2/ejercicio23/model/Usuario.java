package es.curso.struts2.ejercicio23.model;

import java.util.Date;

public class Usuario {

	private String username;
	private String nombre;
	private String apellidos;
	private Date feNacimiento;
	private String direccion;
	private String telefono;

	public Usuario() {
	}

	public Usuario(String username, String nombre, String apellidos,
			Date feNacimiento, String direccion, String telefono) {
		this.username = username;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.feNacimiento = feNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
