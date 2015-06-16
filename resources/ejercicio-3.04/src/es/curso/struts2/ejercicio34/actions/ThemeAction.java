package es.curso.struts2.ejercicio34.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ThemeAction extends ActionSupport {

	private static final long serialVersionUID = -4158186203033312631L;

	private String theme = "xhtml";

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
