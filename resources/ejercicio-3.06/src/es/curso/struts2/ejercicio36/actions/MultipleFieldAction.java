package es.curso.struts2.ejercicio36.actions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class MultipleFieldAction extends ActionSupport {

	private static final long serialVersionUID = -4550144045263169245L;

	static final Log LOG = LogFactory.getLog(MultipleFieldAction.class);

	public String execute() {
		addActionMessage("Se ha enviado el formulario correctamente.");
		return SUCCESS;
	}

	private String[] textfield;
	private String[] textarea;
	private String[] checkbox;

	public String[] getTextfield() {
		return textfield;
	}

	public void setTextfield(String[] textfield) {
		this.textfield = textfield;
	}

	public String[] getTextarea() {
		return textarea;
	}

	public void setTextarea(String[] textarea) {
		this.textarea = textarea;
	}

	public String[] getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String[] checkbox) {
		this.checkbox = checkbox;
	}
}
