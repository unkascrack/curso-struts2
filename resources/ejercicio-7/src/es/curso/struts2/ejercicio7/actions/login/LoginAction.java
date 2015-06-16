package es.curso.struts2.ejercicio7.actions.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import es.curso.struts2.ejercicio7.dao.UsuarioDAO;
import es.curso.struts2.ejercicio7.dao.impl.UsuarioDAOImpl;
import es.curso.struts2.ejercicio7.interceptors.AutenticationInterceptor;
import es.curso.struts2.ejercicio7.model.Usuario;

public class LoginAction extends ActionSupport implements SessionAware,
		ServletRequestAware {

	private static final long serialVersionUID = 6677964313342135603L;

	private String login = "admin";
	private String password = "admin";

	private UsuarioDAO usuarioDAO = UsuarioDAOImpl.getInstance();

	public String login() throws Exception {
		Usuario usuario = usuarioDAO.buscarUsername(login);
		if (usuario == null) {
			addActionError("El usuario indicado no existe.");
			return ERROR;
		}

		if (!usuario.getPassword().equals(password)) {
			addActionError("El password del usuario no es correcto.");
			return ERROR;
		}

		session.put(AutenticationInterceptor.USUARIO, usuario);
		return SUCCESS;
	}

	public String logout() throws Exception {
		request.getSession().invalidate();
		addActionMessage("Se ha finalizado correctamente su sesi&oacute;n.");
		return SUCCESS;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
