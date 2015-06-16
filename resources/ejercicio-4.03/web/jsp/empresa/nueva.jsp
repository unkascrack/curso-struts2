<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-4.03 Validador CIF Personalizado</title>
</head>
<body>
	<h4>Validador CIF Personalizado</h4>
	<hr/>
	
	<s:form action="alta" namespace="/empresa" method="post">
		<s:label label="Datos de la Empresa"/>
		<s:textfield label="CIF" name="identificador" required="true" />
		<s:textfield label="Nombre" name="nombre" required="true" />
		<s:submit label="Enviar" />
	</s:form>
</body>
</html>