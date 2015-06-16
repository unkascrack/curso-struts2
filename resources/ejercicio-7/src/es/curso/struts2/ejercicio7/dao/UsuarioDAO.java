package es.curso.struts2.ejercicio7.dao;

import es.curso.struts2.ejercicio7.model.Usuario;

public interface UsuarioDAO {

	public void save(Usuario usuario);

	public Usuario buscarUsername(String username);
}
