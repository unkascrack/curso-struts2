package es.curso.struts2.ejercicio26.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import es.curso.struts2.ejercicio26.dao.UsuarioDAO;
import es.curso.struts2.ejercicio26.model.Usuario;

public class AltaUsuarioAction extends ActionSupport implements
		ModelDriven<Usuario> {

	private static final long serialVersionUID = 7768015267388276841L;

	private Usuario usuario;
	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();
	
	public String alta() {
		usuarioDAO.alta(this.usuario);
		return SUCCESS;
	}

	@Override
	public Usuario getModel() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

}
