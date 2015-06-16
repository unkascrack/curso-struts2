package es.curso.struts2.ejercicio7.actions.contacto;

import java.util.Collection;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import es.curso.struts2.ejercicio7.actions.ActionBase;
import es.curso.struts2.ejercicio7.dao.ContactoDAO;
import es.curso.struts2.ejercicio7.dao.impl.ContactoDAOImpl;
import es.curso.struts2.ejercicio7.model.Contacto;

public class ContactoAction extends ActionBase implements
		ModelDriven<Contacto>, Preparable {

	private static final long serialVersionUID = 984169998071163347L;

	private Long id;
	private Contacto contacto;
	private Collection<Contacto> contactos;

	public String lista() {
		contactos = contactoDAO.list(getUsuario());
		return SUCCESS;
	}

	public String modificar() {
		contacto.setUsuario(getUsuario());
		contactoDAO.save(contacto, getUsuario());
		addActionMessage("Se ha modificado correctamente el contacto.");
		return SUCCESS;
	}

	public String eliminar() {
		contactoDAO.delete(id, getUsuario());
		addActionMessage("Se ha eliminado correctamente el/los contacto(s).");
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		if (id == null) {
			contacto = new Contacto();
		} else {
			contacto = contactoDAO.read(id, getUsuario());
		}
	}

	@Override
	public Contacto getModel() {
		return contacto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Contacto> getContactos() {
		return contactos;
	}

	private ContactoDAO contactoDAO = ContactoDAOImpl.getInstance();
}
