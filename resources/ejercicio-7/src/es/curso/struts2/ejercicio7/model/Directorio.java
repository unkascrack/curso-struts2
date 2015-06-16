package es.curso.struts2.ejercicio7.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Directorio extends ModelBase {

	private TipoDirectorio tipo;

	private Usuario usuario;
	private Set<Mensaje> mensajes = new LinkedHashSet<Mensaje>();

	public Directorio() {
	}

	public Directorio(Usuario usuario, TipoDirectorio tipo) {
		this.usuario = usuario;
		this.tipo = tipo;
	}

	public TipoDirectorio getTipo() {
		return tipo;
	}

	public void setTipo(TipoDirectorio tipo) {
		this.tipo = tipo;
	}

	public boolean isInbox() {
		return TipoDirectorio.INBOX.equals(getTipo());
	}

	public boolean isSent() {
		return TipoDirectorio.SENT.equals(getTipo());
	}

	public boolean isTrash() {
		return TipoDirectorio.TRASH.equals(getTipo());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Mensaje> getMensajes() {
		return mensajes;
	}

	public Set<Mensaje> getMensajesSinLeer() {
		Set<Mensaje> mensajesSinLeer = new HashSet<Mensaje>();
		if (!isSent()) {
			for (Mensaje mensaje : this.mensajes) {
				if (!mensaje.isLeido()) {
					mensajesSinLeer.add(mensaje);
				}
			}
		}
		return mensajesSinLeer;
	}

	public void setMensajes(Set<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public String toString() {
		int size = mensajes != null ? mensajes.size() : 0;
		return tipo + "[" + size + "]";
	}
}
