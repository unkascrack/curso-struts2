package es.curso.struts2.ejercicio38.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Chain2Action extends ActionSupport {

	private static final long serialVersionUID = 347028587084540797L;

	private String chain1ActionPropiedad;
	private String chain2ActionPropiedad = "Propiedad Chain2Action";

	public String getChain1ActionPropiedad() {
		return chain1ActionPropiedad;
	}

	public void setChain1ActionPropiedad(String chain1ActionPropiedad) {
		this.chain1ActionPropiedad = chain1ActionPropiedad;
	}

	public String getChain2ActionPropiedad() {
		return chain2ActionPropiedad;
	}

	public void setChain2ActionPropiedad(String chain2ActionPropiedad) {
		this.chain2ActionPropiedad = chain2ActionPropiedad;
	}
}
