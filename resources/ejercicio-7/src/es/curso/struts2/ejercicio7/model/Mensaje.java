package es.curso.struts2.ejercicio7.model;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class Mensaje extends ModelBase {

	private String from;
	private String to;
	private String cc;
	private String bcc;
	private String subject;
	private String text;
	private Date date;
	private boolean leido = false;

	private Directorio directorio;

	public Mensaje() {
	}

	public Mensaje(Long id) {
		setId(id);
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = StringUtils.lowerCase(from);
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = StringUtils.lowerCase(StringUtils.replace(to, ";", ","));
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = StringUtils.lowerCase(StringUtils.replace(cc, ";", ","));
		;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = StringUtils.lowerCase(StringUtils.replace(bcc, ";", ","));
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isLeido() {
		return leido || getDirectorio().isSent();
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public Directorio getDirectorio() {
		return directorio;
	}

	public void setDirectorio(Directorio directorio) {
		this.directorio = directorio;
	}
}
