package es.curso.struts2.ejercicio25.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import es.curso.struts2.ejercicio25.model.Usuario;

public class UsuarioDAO {

	private static UsuarioDAO usuarioDAO = new UsuarioDAO();

	private UsuarioDAO() {
	}

	public static UsuarioDAO getInstance() {
		return usuarioDAO;
	}

	private static final Map<Integer, Usuario> USUARIOS = new HashMap<Integer, Usuario>();

	static {
		USUARIOS.put(Usuario.getDefaultId(), new Usuario("admin", "admin", "",
				null, "", ""));
		USUARIOS.put(Usuario.getDefaultId(), new Usuario("prueba", "Perico",
				"Palotes", new Date(), "Desconocida", "666 666 666"));
		USUARIOS.put(Usuario.getDefaultId(), new Usuario("usuario1",
				"Usuario1", "", new Date(), "Madrid", "916-666-666"));
		USUARIOS.put(Usuario.getDefaultId(), new Usuario("usuario2",
				"Usuario2", "Apellido Usuario2", null, "Barcelona",
				"555-666-666"));
	}

	public Collection<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(USUARIOS.values());
	}

	public Usuario getUsuario(Integer id) {
		Usuario usuario = USUARIOS.get(id);
		try {
			return (Usuario) (usuario != null ? usuario.clone() : null);
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public void alta(Usuario usuario) {
		USUARIOS.put(Usuario.getDefaultId(), usuario);
		usuario.setId();
	}
}
