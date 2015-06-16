<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.10 Aplicación CRUD Contactos Segura</title>
</head>
<body>
	<h4>Alta Usuario</h4>
	<hr/>
	
	<s:form action="guardar" namespace="/usuarios">
		<s:actionerror/>
		<s:actionmessage/>
		<s:textfield name="username" label="Username*"/>
		<s:password name="password" label="Password*"/>
		<s:textfield name="nombre" label="Nombre"/>
		<s:submit value="Guardar"/>
		
		<s:url var="urlCancelar" action="login" namespace="/usuarios"/>
		<s:a href="%{urlCancelar}">Cancelar</s:a>
	</s:form>
	<hr/>
</body>
</html>