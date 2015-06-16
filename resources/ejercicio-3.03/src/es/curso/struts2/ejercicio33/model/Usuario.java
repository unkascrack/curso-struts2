package es.curso.struts2.ejercicio33.model;

public class Usuario {

	private String username;
	private String password;
	private String nombre;
	private String apellidos;

	public Usuario() {
	}

	public Usuario(String username, String password, String nombre,
			String apellidos) {
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
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
}
