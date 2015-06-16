package es.curso.struts2.ejercicio19.actions;

public class HolaMundo {

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
