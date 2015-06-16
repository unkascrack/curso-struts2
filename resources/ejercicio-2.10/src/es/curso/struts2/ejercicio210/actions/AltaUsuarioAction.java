package es.curso.struts2.ejercicio210.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import es.curso.struts2.ejercicio210.dao.UsuarioDAO;
import es.curso.struts2.ejercicio210.interceptors.LoginInterceptor;
import es.curso.struts2.ejercicio210.model.Usuario;

public class AltaUsuarioAction extends ActionSupport implements
		ModelDriven<Usuario>, SessionAware {

	private static final long serialVersionUID = 7768015267388276841L;

	private Usuario usuario;

	public String alta() {
		usuarioDAO.alta(this.usuario);
		session.put(LoginInterceptor.USUARIO, usuario);
		return SUCCESS;
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

	@Override
	public Usuario getModel() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
