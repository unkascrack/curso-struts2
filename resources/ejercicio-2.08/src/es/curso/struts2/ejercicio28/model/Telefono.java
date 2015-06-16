package es.curso.struts2.ejercicio28.model;

public class Telefono {

	private String value;

	public Telefono() {
	}

	public Telefono(String value) {
		setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		if (isTelefono(value)) {
			this.value = value;
		}
	}

	public static boolean isTelefono(String telefono) {	
		return telefono != null
				&& telefono.matches("\\d{3}-\\d{3}-\\d{3}");
	}
}
