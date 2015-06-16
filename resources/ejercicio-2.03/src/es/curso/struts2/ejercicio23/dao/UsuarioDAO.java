package es.curso.struts2.ejercicio23.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import es.curso.struts2.ejercicio23.model.Usuario;

public class UsuarioDAO {

	private static UsuarioDAO usuarioDAO = new UsuarioDAO();

	private UsuarioDAO() {
	}

	public static UsuarioDAO getInstance() {
		return usuarioDAO;
	}

	private static final Collection<Usuario> USUARIOS = new ArrayList<Usuario>();

	static {
		USUARIOS.add(new Usuario("admin", "admin", "", null, "", ""));
		USUARIOS.add(new Usuario("prueba", "Perico", "Palotes", new Date(),
				"Desconocida", "666 666 666"));
		USUARIOS.add(new Usuario("usuario1", "Usuario1", "", new Date(),
				"Madrid", "916-666-666"));
		USUARIOS.add(new Usuario("usuario2", "Usuario2", "Apellido Usuario2",
				null, "Barcelona", "555-666-666"));
	}

	public Collection<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(USUARIOS);
	}
}
