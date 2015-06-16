package es.curso.struts2.ejercicio27.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import es.curso.struts2.ejercicio27.model.Usuario;

public class UsuarioDAO {

	private static UsuarioDAO usuarioDAO = new UsuarioDAO();

	private UsuarioDAO() {
	}

	public static UsuarioDAO getInstance() {
		return usuarioDAO;
	}

	private static final Map<String, Usuario> USUARIOS = new HashMap<String, Usuario>();

	static {
		USUARIOS.put("admin", new Usuario("admin", "admin", "admin", "", null,
				"", ""));
		USUARIOS.put("prueba", new Usuario("prueba", "prueba", "Perico",
				"Palotes", new Date(), "Desconocida", "666-666-666"));
		USUARIOS.put("usuario1", new Usuario("usuario1", "usuario1",
				"Usuario1", "", new Date(), "Madrid", "916-666-666"));
	}

	public Collection<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(USUARIOS.values());
	}

	public Usuario buscarUsuario(String username) {
		Usuario usuario = USUARIOS.get(username);
		try {
			return (Usuario) (usuario != null ? usuario.clone() : null);
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
