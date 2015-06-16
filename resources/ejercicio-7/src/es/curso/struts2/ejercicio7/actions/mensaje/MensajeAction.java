package es.curso.struts2.ejercicio7.actions.mensaje;

import static es.curso.struts2.ejercicio7.model.TipoDirectorio.INBOX;

import java.util.Collection;
import java.util.Map;

import es.curso.struts2.ejercicio7.actions.ActionBase;
import es.curso.struts2.ejercicio7.dao.DirectorioDAO;
import es.curso.struts2.ejercicio7.dao.impl.DirectorioDAOImpl;
import es.curso.struts2.ejercicio7.model.Directorio;
import es.curso.struts2.ejercicio7.model.Mensaje;
import es.curso.struts2.ejercicio7.model.TipoDirectorio;

public class MensajeAction extends ActionBase {

	private static final long serialVersionUID = -8764499729481499981L;

	private static final String DIRECTORIOS = "directorios";
	private static final String TIPO_DIRECTORIO = "tipoDirectorio";

	private TipoDirectorio tipo;
	private Collection<Mensaje> mensajes;
	private Long id;
	private Mensaje mensaje;

	private DirectorioDAO directorioDAO = DirectorioDAOImpl.getInstance();

	public String lista() {
		Map<TipoDirectorio, Directorio> directorios = directorioDAO
				.list(getUsuario());
		getSession().put(DIRECTORIOS, directorios.values());

		TipoDirectorio tipo = getTipoDirectorio();
		getSession().put(TIPO_DIRECTORIO, tipo);
		this.mensajes = directorios.get(tipo).getMensajes();

		return SUCCESS;
	}

	public String alta() {
		directorioDAO.enviarMensaje(mensaje, getUsuario());
		addActionMessage("Se ha enviado correctamente el mensaje.");
		return SUCCESS;
	}

	public String consulta() {
		mensaje = directorioDAO.readMensaje(id, getUsuario(),
				getTipoDirectorio());
		addActionMessage("Se ha leido correctamente el mensaje.");
		return SUCCESS;
	}

	public String eliminar() {
		directorioDAO.eliminarMensaje(id, getUsuario(), getTipoDirectorio());
		addActionMessage("Se ha eliminado correctamente el mensaje.");
		return SUCCESS;
	}

	public TipoDirectorio getTipo() {
		return tipo;
	}

	public void setTipo(TipoDirectorio tipo) {
		this.tipo = tipo;
	}

	public TipoDirectorio getTipoDirectorio() {
		TipoDirectorio tipo = null;
		if (this.tipo != null) {
			tipo = this.tipo;
		} else {
			tipo = (TipoDirectorio) getSession().get(TIPO_DIRECTORIO);
		}
		return tipo != null ? tipo : INBOX;
	}

	public Collection<Mensaje> getMensajes() {
		return mensajes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
}
