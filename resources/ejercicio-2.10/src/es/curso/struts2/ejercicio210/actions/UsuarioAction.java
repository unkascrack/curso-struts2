package es.curso.struts2.ejercicio210.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import es.curso.struts2.ejercicio210.dao.UsuarioDAO;
import es.curso.struts2.ejercicio210.interceptors.LoginInterceptor;
import es.curso.struts2.ejercicio210.model.Usuario;

public class UsuarioAction extends ActionSupport implements SessionAware,
		ServletRequestAware {

	private static final long serialVersionUID = 7277776277905916528L;

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

	public String logout() {
		request.getSession().invalidate();
		return SUCCESS;
	}

	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();

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

	private HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
