package es.curso.struts2.ejercicio7.dao.impl;

import es.curso.struts2.ejercicio7.model.Directorio;
import es.curso.struts2.ejercicio7.model.Mensaje;

public class MensajeDAOImpl {

	private long nextId = 1;

	private MensajeDAOImpl() {
	}

	private static MensajeDAOImpl mensajeDAO = new MensajeDAOImpl();

	public static MensajeDAOImpl getInstance() {
		return mensajeDAO;
	}

	public void save(Mensaje mensaje, Directorio directorio) {
		if (mensaje.getId() == null) {
			mensaje.setId(nextId++);
		}
		mensaje.setDirectorio(directorio);
		directorio.getMensajes().add(mensaje);
	}

	public void move(Mensaje mensaje, Directorio from, Directorio to) {
		from.getMensajes().remove(mensaje);
		mensaje.setDirectorio(to);
		to.getMensajes().add(mensaje);
	}

	public void delete(Mensaje mensaje, Directorio directorio) {
		if (directorio.getMensajes().contains(mensaje)) {
			directorio.getMensajes().remove(mensaje);
		}
	}
}
