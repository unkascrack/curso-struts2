package es.curso.struts2.ejercicio38.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Chain1Action extends ActionSupport {

	private static final long serialVersionUID = -1181488641869819592L;

	private String chain1ActionPropiedad = "Propiedad Chain1Action";

	public String getChain1ActionPropiedad() {
		return chain1ActionPropiedad;
	}

	public void setChain1ActionPropiedad(String chain1ActionPropiedad) {
		this.chain1ActionPropiedad = chain1ActionPropiedad;
	}
}
