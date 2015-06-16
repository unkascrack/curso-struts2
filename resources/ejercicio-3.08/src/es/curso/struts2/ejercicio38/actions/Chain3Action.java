package es.curso.struts2.ejercicio38.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Chain3Action extends ActionSupport {

	private static final long serialVersionUID = 6100818960153973101L;

	private String chain1ActionPropiedad;
	private String chain2ActionPropiedad;
	private String chain3ActionPropiedad = "Propiedad Chain3Action";

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

	public String getChain3ActionPropiedad() {
		return chain3ActionPropiedad;
	}

	public void setChain3ActionPropiedad(String chain3ActionPropiedad) {
		this.chain3ActionPropiedad = chain3ActionPropiedad;
	}
}
