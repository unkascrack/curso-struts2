package es.curso.struts2.ejercicio22.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import es.curso.struts2.ejercicio22.dao.UsuarioDAO;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -1335003291198071126L;
	
	private static final String PARAM_USUARIO = "usuario";

	public String execute() {
		if (!UsuarioDAO.isUsuario(username, password)) {
			addActionError("El usuario indicado no es correcto.");
			return ERROR;
		}
		
		this.session.put(PARAM_USUARIO, username);
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

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
