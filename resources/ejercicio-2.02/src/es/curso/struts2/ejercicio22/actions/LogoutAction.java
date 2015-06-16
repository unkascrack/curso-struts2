package es.curso.struts2.ejercicio22.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = -5352300736450506120L;

	public String logout() throws Exception {
		request.getSession().invalidate();
		addActionMessage("Se ha finalizado correctamente su sesi&oacute;n.");
		return SUCCESS;
	}

	private HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
