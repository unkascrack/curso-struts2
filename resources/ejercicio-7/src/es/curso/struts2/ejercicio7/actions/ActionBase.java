package es.curso.struts2.ejercicio7.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import es.curso.struts2.ejercicio7.interceptors.AutenticationInterceptor;
import es.curso.struts2.ejercicio7.model.Usuario;

public class ActionBase extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 8675253920617206721L;
	
	public static final String MENU = "menu";

	public Usuario getUsuario() {
		return (Usuario) session.get(AutenticationInterceptor.USUARIO);
	}
	
	private Map<String, Object> session;

	@Override
	public final void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}
}
