package es.curso.struts2.ejercicio7.actions.usuario;

import com.opensymphony.xwork2.ModelDriven;

import es.curso.struts2.ejercicio7.actions.ActionBase;
import es.curso.struts2.ejercicio7.dao.UsuarioDAO;
import es.curso.struts2.ejercicio7.dao.impl.UsuarioDAOImpl;
import es.curso.struts2.ejercicio7.interceptors.AutenticationInterceptor;
import es.curso.struts2.ejercicio7.model.Usuario;

public class AltaUsuarioAction extends ActionBase implements
		ModelDriven<Usuario> {

	private static final long serialVersionUID = 2570576952468797220L;

	private Usuario usuario;

	private UsuarioDAO usuarioDAO = UsuarioDAOImpl.getInstance();

	public String alta() {
		usuarioDAO.save(usuario);
		getSession().put(AutenticationInterceptor.USUARIO, usuario);
		addActionMessage("Se ha creado correctamente su cuenta, puede comenzar a trabajar con su WebMail.");
		return SUCCESS;
	}

	@Override
	public void validate() {
		String username = this.usuario.getUsername();
		Usuario usuario = usuarioDAO.buscarUsername(username);
		if (usuario != null) {
			addFieldError("username", "El nombre '" + username
					+ "' ya es utilizado por otro usuario.");
		}
	}

	@Override
	public Usuario getModel() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}
}
