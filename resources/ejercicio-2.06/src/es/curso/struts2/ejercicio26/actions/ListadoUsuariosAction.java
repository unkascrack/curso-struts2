package es.curso.struts2.ejercicio26.actions;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;

import es.curso.struts2.ejercicio26.dao.UsuarioDAO;
import es.curso.struts2.ejercicio26.model.Usuario;

public class ListadoUsuariosAction extends ActionSupport {

	private static final long serialVersionUID = -1759141577556336173L;

	private Collection<Usuario> usuarios;
	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();

	public String execute() {
		this.usuarios = usuarioDAO.getUsuarios();
		return SUCCESS;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}
}
