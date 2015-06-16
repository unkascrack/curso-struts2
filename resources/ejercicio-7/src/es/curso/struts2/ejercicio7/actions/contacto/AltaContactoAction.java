package es.curso.struts2.ejercicio7.actions.contacto;

import com.opensymphony.xwork2.ModelDriven;

import es.curso.struts2.ejercicio7.actions.ActionBase;
import es.curso.struts2.ejercicio7.dao.ContactoDAO;
import es.curso.struts2.ejercicio7.dao.impl.ContactoDAOImpl;
import es.curso.struts2.ejercicio7.model.Contacto;

public class AltaContactoAction extends ActionBase implements
		ModelDriven<Contacto> {

	private static final long serialVersionUID = 2079981829649147144L;

	private Contacto contacto;

	public String alta() {
		contactoDAO.save(contacto, getUsuario());
		addActionMessage("Se ha creado correctamente el contacto.");
		return SUCCESS;
	}

	@Override
	public void validate() {
		String email = contacto.getEmail();
		Contacto contacto = contactoDAO.buscarEmail(email, getUsuario());
		if (contacto != null) {
			addFieldError("email", "El mail del contacto '" + email
					+ "' ya es utilizado por otro contacto.");
		}
	}

	@Override
	public Contacto getModel() {
		if (contacto == null) {
			contacto = new Contacto();
		}
		return contacto;
	}

	private ContactoDAO contactoDAO = ContactoDAOImpl.getInstance();
}
