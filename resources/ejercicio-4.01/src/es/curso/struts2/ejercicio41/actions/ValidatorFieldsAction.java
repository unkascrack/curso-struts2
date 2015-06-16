package es.curso.struts2.ejercicio41.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ValidatorFieldsAction extends ActionSupport {

	private static final long serialVersionUID = -1379392153583071165L;

	private String requiredValidatorField;
	private String requiredStringValidatorField;
	private Integer integerValidatorField;
	private Date dateValidatorField;
	private String emailValidatorField;
	private String urlValidatorField;
	private String stringLengthValidatorField;
	private String regexValidatorField;
	private String fieldExpressionValidatorField;

	public String getRequiredValidatorField() {
		return requiredValidatorField;
	}

	public void setRequiredValidatorField(String requiredValidatorField) {
		this.requiredValidatorField = requiredValidatorField;
	}

	public String getRequiredStringValidatorField() {
		return requiredStringValidatorField;
	}

	public void setRequiredStringValidatorField(
			String requiredStringValidatorField) {
		this.requiredStringValidatorField = requiredStringValidatorField;
	}

	public Integer getIntegerValidatorField() {
		return integerValidatorField;
	}

	public void setIntegerValidatorField(Integer integerValidatorField) {
		this.integerValidatorField = integerValidatorField;
	}

	public Date getDateValidatorField() {
		return dateValidatorField;
	}

	public void setDateValidatorField(Date dateValidatorField) {
		this.dateValidatorField = dateValidatorField;
	}

	public String getEmailValidatorField() {
		return emailValidatorField;
	}

	public void setEmailValidatorField(String emailValidatorField) {
		this.emailValidatorField = emailValidatorField;
	}

	public String getUrlValidatorField() {
		return urlValidatorField;
	}

	public void setUrlValidatorField(String urlValidatorField) {
		this.urlValidatorField = urlValidatorField;
	}

	public String getStringLengthValidatorField() {
		return stringLengthValidatorField;
	}

	public void setStringLengthValidatorField(String stringLengthValidatorField) {
		this.stringLengthValidatorField = stringLengthValidatorField;
	}

	public String getRegexValidatorField() {
		return regexValidatorField;
	}

	public void setRegexValidatorField(String regexValidatorField) {
		this.regexValidatorField = regexValidatorField;
	}

	public String getFieldExpressionValidatorField() {
		return fieldExpressionValidatorField;
	}

	public void setFieldExpressionValidatorField(
			String fieldExpressionValidatorField) {
		this.fieldExpressionValidatorField = fieldExpressionValidatorField;
	}

}
