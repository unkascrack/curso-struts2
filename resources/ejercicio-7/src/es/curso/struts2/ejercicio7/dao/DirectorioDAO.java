package es.curso.struts2.ejercicio7.dao;

import java.util.Map;
import java.util.Set;

import es.curso.struts2.ejercicio7.model.Directorio;
import es.curso.struts2.ejercicio7.model.Mensaje;
import es.curso.struts2.ejercicio7.model.TipoDirectorio;
import es.curso.struts2.ejercicio7.model.Usuario;

public interface DirectorioDAO {

	public Map<TipoDirectorio, Directorio> list(Usuario usuario);
	
	public void saveAll(Set<Directorio> directorios, Usuario usuario);
	
	public void enviarMensaje(Mensaje mensaje, Usuario usuario);
	
	public Mensaje readMensaje(Long id, Usuario usuario, TipoDirectorio tipo);
	
	public void eliminarMensaje(Long id, Usuario usuario, TipoDirectorio tipo);	
}
