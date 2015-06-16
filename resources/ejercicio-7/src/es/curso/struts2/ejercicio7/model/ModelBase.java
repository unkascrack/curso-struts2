package es.curso.struts2.ejercicio7.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class ModelBase implements Cloneable {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			return id.equals(((ModelBase) obj).getId());
		} catch (Exception exc) {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return 31 + ((id == null) ? 0 : id.hashCode());
	}

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return clone;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
