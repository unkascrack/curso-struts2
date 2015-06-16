package es.curso.struts2.ejercicio310.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class VelocityAction extends ActionSupport {

	private static final long serialVersionUID = -8593395864656674172L;

	private String nombre;
	private Date feNacimiento;
	private String informacion;
	private String colorFavorito;
	private boolean mayorEdad;
	private String comunidad;
	private String provincia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFeNacimiento() {
		return feNacimiento;
	}

	public void setFeNacimiento(Date feNacimiento) {
		this.feNacimiento = feNacimiento;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public String getColorFavorito() {
		return colorFavorito;
	}

	public void setColorFavorito(String colorFavorito) {
		this.colorFavorito = colorFavorito;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
