package es.curso.struts2.ejercicio27.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import es.curso.struts2.ejercicio27.dao.UsuarioDAO;
import es.curso.struts2.ejercicio27.interceptors.LoginInterceptor;
import es.curso.struts2.ejercicio27.model.Usuario;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 4255773346425729153L;

	public String login() {
		Usuario usuario = usuarioDAO.buscarUsuario(this.username);
		if (usuario == null) {
			addActionError("El usuario indicado no existe.");
			return ERROR;
		}

		if (!usuario.getPassword().equals(password)) {
			addActionError("El password del usuario no es correcto.");
			return ERROR;
		}

		session.put(LoginInterceptor.USUARIO, usuario);
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

	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();
	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
