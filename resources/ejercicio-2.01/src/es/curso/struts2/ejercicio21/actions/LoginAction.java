package es.curso.struts2.ejercicio21.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 6443636520599385716L;

	public static final String DEFAULT_USERNAME = "admin";
	public static final String DEFAULT_PASSWORD = "admin";

	public String execute() {
		if (!DEFAULT_USERNAME.equals(this.username)) {
			addActionError("El usuario indicado no existe.");
			return ERROR;
		}

		if (!DEFAULT_PASSWORD.equals(this.password)) {
			addActionError("El password del usuario no es correcto.");
			return ERROR;
		}
		
		return SUCCESS;
	}

	private String username;
	private String password;

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

}
