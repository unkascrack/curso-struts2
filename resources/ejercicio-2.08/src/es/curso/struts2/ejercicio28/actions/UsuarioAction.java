package es.curso.struts2.ejercicio28.actions;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import es.curso.struts2.ejercicio28.dao.UsuarioDAO;
import es.curso.struts2.ejercicio28.model.Usuario;

public class UsuarioAction extends ActionSupport implements
		ModelDriven<Usuario> {

	private static final long serialVersionUID = -8403295156394356421L;

	private Usuario usuario;

	public String alta() {
		usuarioDAO.alta(this.usuario);
		return SUCCESS;
	}

	public String listado() {
		this.usuarios = usuarioDAO.getUsuarios();
		return SUCCESS;
	}

	@Override
	public Usuario getModel() {
		if (this.usuario == null) {
			this.usuario = new Usuario();
		}
		return this.usuario;
	}

	@Override
	public void validate() {
		super.validate();
		if (usuario.getUsername().length() == 0) {
			addFieldError("username", "Username es obligatorio.");
		} else if (usuarioDAO.buscarUsuario(usuario.getUsername()) != null) {
			addFieldError("username",
					"El username elegido ya esta seleccionado, debe indicar otro.");
		}

		if (usuario.getPassword().length() == 0) {
			addFieldError("password", "Password es obligatorio");
		}
	}

	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();

	private String username;
	private Collection<Usuario> usuarios;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
