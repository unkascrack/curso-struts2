package es.curso.struts2.ejercicio210.dao;

import java.util.HashMap;
import java.util.Map;

import es.curso.struts2.ejercicio210.model.Usuario;

public class UsuarioDAO {

	private static UsuarioDAO usuarioDAO = new UsuarioDAO();

	private UsuarioDAO() {
	}

	public static UsuarioDAO getInstance() {
		return usuarioDAO;
	}

	private static final Map<String, Usuario> USUARIOS = new HashMap<String, Usuario>();

	static {
		USUARIOS.put("admin", new Usuario("admin", "admin", "admin"));
	}

	public Usuario buscarUsuario(String username) {
		Usuario usuario = USUARIOS.get(username);
		try {
			return (Usuario) (usuario != null ? usuario.clone() : null);
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public void alta(Usuario usuario) {
		if (USUARIOS.containsKey(usuario.getUsername())) {
			throw new RuntimeException(
					"El login del usuario seleccionado ya existe.");
		}
		USUARIOS.put(usuario.getUsername(), usuario);
	}
}
