package es.curso.struts2.ejercicio44.actions;

import com.opensymphony.xwork2.ActionSupport;

public class I18NAction extends ActionSupport {

	private static final long serialVersionUID = -143484550869634336L;

	public String getMensaje() {
		return getText("action.mensaje");
	}
}
