package es.curso.struts2.ejercicio33.actions;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import es.curso.struts2.ejercicio33.dao.UsuarioDAO;
import es.curso.struts2.ejercicio33.model.Usuario;

public class UsuarioAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = -6157984653043661635L;

	@Override
	public void prepare() throws Exception {
		if (this.username != null) {
			this.jsonModel = usuarioDAO.buscarUsuario(this.username);
		}
	}

	private String username;
	private Object jsonModel;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Object getJsonModel() {
		return jsonModel;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarioDAO.getUsuarios();
	}

	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();

}
