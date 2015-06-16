package es.curso.struts2.ejercicio31.actions;

import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class StreamAction extends ActionSupport implements ServletContextAware {

	private static final long serialVersionUID = 3709212785699498422L;

	private InputStream inputStream;
	private String path = "jsp/menu.jsp";

	public String execute() {
		inputStream = servletContext.getResourceAsStream(path);

		if (inputStream == null) {
			addActionError("No se encuentra el archivo que se intenta descargar: "
					+ path);
			return ERROR;
		}
		return SUCCESS;
	}

	public InputStream getInputStream() throws Exception {
		return inputStream;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	private ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
}
