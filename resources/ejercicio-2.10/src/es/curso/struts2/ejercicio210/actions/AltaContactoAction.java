package es.curso.struts2.ejercicio210.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import es.curso.struts2.ejercicio210.dao.ContactoDAO;
import es.curso.struts2.ejercicio210.interceptors.LoginInterceptor;
import es.curso.struts2.ejercicio210.model.Contacto;
import es.curso.struts2.ejercicio210.model.Usuario;

public class AltaContactoAction extends ActionSupport implements
		ModelDriven<Contacto>, SessionAware {

	private static final long serialVersionUID = -7858744411856176701L;

	private Contacto contacto;

	public String alta() {
		contactoDAO.alta(this.contacto, getUsuario());
		return SUCCESS;
	}

	@Override
	public void validate() {
		super.validate();
		if (this.contacto.getEmail().length() == 0) {
			addFieldError("email", "Email es obligatorio.");
		} else if (contactoDAO.editar(this.contacto.getEmail(), getUsuario()) != null) {
			addFieldError("email",
					"El email seleccionado ya es utilizado por otro contacto.");
		}

		if (this.contacto.getNombre().length() == 0) {
			addFieldError("nombre", "Nombre es obligatorio");
		}
	}

	private ContactoDAO contactoDAO = ContactoDAO.getInstance();

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public Contacto getModel() {
		if (this.contacto == null) {
			this.contacto = new Contacto();
		}
		return this.contacto;
	}

	private Usuario getUsuario() {
		return (Usuario) this.session.get(LoginInterceptor.USUARIO);
	}
}
