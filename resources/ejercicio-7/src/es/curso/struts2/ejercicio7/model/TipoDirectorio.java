package es.curso.struts2.ejercicio7.model;

public enum TipoDirectorio {
	INBOX("Recibidos"), SENT("Enviados"), TRASH("Papelera");
	
	private String text;
	
	private TipoDirectorio(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}
