package es.curso.struts2.ejercicio22.dao;

import java.util.HashMap;
import java.util.Map;

public class UsuarioDAO {

	public static final Map<String, String> USUARIOS = new HashMap<String, String>();

	static {
		USUARIOS.put("admin", "admin");
		USUARIOS.put("prueba", "prueba");
		USUARIOS.put("usuario1", "prueba");
		USUARIOS.put("usuario2", "prueba");
		USUARIOS.put("usuario3", "prueba");
	}

	private UsuarioDAO() {
	}

	public static boolean isUsuario(String username, String password) {
		String passOriginal = USUARIOS.get(username);
		return passOriginal != null && passOriginal.equals(password);
	}
}
