package es.curso.struts2.ejercicio43.actions;

import com.opensymphony.xwork2.ActionSupport;

public class EmpresaAction extends ActionSupport {

	private static final long serialVersionUID = -1379392153583071165L;

	public String alta() {
		System.out.println("Realizando el alta de los datos de la empresa...");
		return SUCCESS;
	}

	private String identificador;
	private String nombre;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
