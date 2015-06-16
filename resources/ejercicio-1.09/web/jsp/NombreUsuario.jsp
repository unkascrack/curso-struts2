<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-1.9 HolaMundo</title>
</head>
<body>
	<hr/>
	<h4>Introduce tu nombre</h4>
	<s:form action="holaMundo">
		<s:textfield name="nombre" label="Nombre"/>
		<s:submit/>
	</s:form>
	<hr/>
</body>
</html>