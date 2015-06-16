package es.curso.struts2.ejercicio210.actions;

import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import es.curso.struts2.ejercicio210.dao.ContactoDAO;
import es.curso.struts2.ejercicio210.interceptors.LoginInterceptor;
import es.curso.struts2.ejercicio210.model.Contacto;
import es.curso.struts2.ejercicio210.model.Usuario;

public class ContactoAction extends ActionSupport implements
		ModelDriven<Contacto>, SessionAware, Preparable {

	private static final long serialVersionUID = 1709567750489595263L;

	private String email;
	private Contacto contacto;
	private Collection<Contacto> contactos;

	public String listado() {
		this.contactos = contactoDAO.listado(getUsuario());
		return SUCCESS;
	}

	public String editar() {
		return SUCCESS;
	}

	public String modificar() {
		contactoDAO.modificar(contacto, getUsuario());
		return SUCCESS;
	}

	public String eliminar() {
		contactoDAO.eliminar(contacto, getUsuario());
		return SUCCESS;
	}

	private ContactoDAO contactoDAO = ContactoDAO.getInstance();

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void prepare() throws Exception {
		if (email == null) {
			contacto = new Contacto();
		} else {
			contacto = contactoDAO.editar(email, getUsuario());
		}
	}

	@Override
	public Contacto getModel() {
		return contacto;
	}

	private Usuario getUsuario() {
		return (Usuario) this.session.get(LoginInterceptor.USUARIO);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Contacto> getContactos() {
		return contactos;
	}
}
