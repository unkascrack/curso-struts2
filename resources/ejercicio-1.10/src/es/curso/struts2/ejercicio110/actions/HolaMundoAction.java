package es.curso.struts2.ejercicio110.actions;

import org.apache.struts2.config.Result;

@Result(name="SUCCESS", value="/jsp/HolaMundo.jsp")
public class HolaMundoAction {

	private static final String HOLA = "Hola ";

	public String execute() {
		setSaludo(HOLA + getNombre());
		return "SUCCESS";
	}

	private String nombre;
	private String saludo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
