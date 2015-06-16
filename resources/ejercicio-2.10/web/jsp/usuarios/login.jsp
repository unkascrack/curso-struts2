<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.10 Aplicación CRUD Contactos Segura</title>
</head>
<body>
	<h4>Login</h4>
	<hr/>
	
	<s:form action="registro" namespace="/usuarios">
		<s:actionerror/>
		<s:actionmessage/>
		<s:textfield name="username" label="Usuario*"/>
		<s:password name="password" label="Contraseña*"/>
		<s:submit value="Login"/>
		<s:url var="urlAltaUsuario" action="alta" namespace="/usuarios"/>
		<s:a href="%{urlAltaUsuario}">+Nuevo Usuario</s:a>
	</s:form>
	<hr/>
</body>
</html>