<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-4.01 Validación Campos Servidor</title>
</head>
<body>
	<h4>Validación Campos Servidor</h4>
	<hr/>
	
	<h5>Todos los Errores de Campos:</h5>
	<s:fielderror />
	<hr/>
	
	<h5>Todos los Errores 'RequiredStringValidatorField':</h5>
	<s:fielderror value="%{'requiredStringValidatorField'}"/>
	<hr/>
		
	<h5>Todos los Errores 'StringLengthValidatorField':</h5>
	<s:fielderror>
		<s:param>stringLengthValidatorField</s:param>
	</s:fielderror>
	<hr/>	
	
	<s:form action="validation" namespace="/validation" method="post" theme="xhtml">
		<s:textfield label="Campo Required Validator" name="requiredValidatorField" />
		<s:textfield label="Campo Required String Validator" name="requiredStringValidatorField" />
		<s:textfield label="Campo Integer Validator" name="integerValidatorField" />
		<s:textfield label="Campo Date Validator (01/01/1990-01/01/2010)" name="dateValidatorField" />
		<s:textfield label="Campo Email Validator" name="emailValidatorField" />
		<s:textfield label="Campo URL Validator" name="urlValidatorField" />
		<s:textfield label="Campo String Length Validator (2-4)" name="stringLengthValidatorField" />
		<s:textfield label="Campo Regex Validator" name="regexValidatorField"/>
		<s:textfield label="Campo Field Expression Validator" name="fieldExpressionValidatorField" />
		<s:submit label="Enviar" />
	</s:form>
</body>
</html>