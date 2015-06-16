<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.10 Aplicación CRUD Contactos Segura</title>
</head>
<body>
	<h4>Logout</h4>
	<hr/>
	
	Se ha cerrado correctamente su sesión.
	
		
	<s:url var="urlContactos" action="listado" namespace="/contactos"/>
	<s:a href="%{urlContactos}">Volver</s:a>

	<hr/>
</body>
</html>