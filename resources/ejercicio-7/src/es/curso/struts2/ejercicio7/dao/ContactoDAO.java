package es.curso.struts2.ejercicio7.dao;

import java.util.Collection;

import es.curso.struts2.ejercicio7.model.Contacto;
import es.curso.struts2.ejercicio7.model.Usuario;

public interface ContactoDAO {

	public Collection<Contacto> list(Usuario usuario);
	
	public Contacto buscarEmail(String email, Usuario usuario);
	
	public void save(Contacto contacto, Usuario usuario);
	
	public void delete(Long id, Usuario usuario);
	
	public Contacto read(Long id, Usuario usuario);
}
