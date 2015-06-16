package es.curso.struts2.ejercicio33.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import es.curso.struts2.ejercicio33.model.Usuario;

public class UsuarioDAO {

	private UsuarioDAO() {
	}

	private static UsuarioDAO instance = new UsuarioDAO();
	private static final Map<String, Usuario> USUARIOS = new HashMap<String, Usuario>();

	public static final UsuarioDAO getInstance() {
		return instance;
	}

	public Usuario buscarUsuario(String username) {
		return USUARIOS.get(username);
	}

	public Collection<Usuario> getUsuarios() {
		return USUARIOS.values();
	}

	static {
		USUARIOS.put("admin", new Usuario("admin", "admin", "admin", "admin"));
		USUARIOS.put("prueba", new Usuario("prueba", "prueba", "prueba",
				"prueba"));
		USUARIOS.put("test", new Usuario("test", "test", "test", ""));
	}
}
