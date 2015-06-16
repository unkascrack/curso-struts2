package es.curso.struts2.ejercicio24.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import es.curso.struts2.ejercicio24.dao.UsuarioDAO;
import es.curso.struts2.ejercicio24.model.Usuario;

public class ConsultaUsuarioAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 7060286996845694442L;

	private Usuario usuario;
	private Integer id;
	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();

	@Override
	public void prepare() throws Exception {
		this.usuario = usuarioDAO.getUsuario(this.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
