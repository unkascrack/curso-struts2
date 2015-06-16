<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.10 Aplicación CRUD Contactos Segura</title>
</head>
<body>
	<h4>Editar Contacto</h4>
	
	<s:property value="%{#session.usuario.username}"/>
	<s:url var="urlLogout" action="logout" namespace="/usuarios"/>
	<s:a href="%{urlLogout}">Cerrar Sesión</s:a>
	<hr/>
	
	<s:form action="modificar" namespace="/contactos">
		<s:textfield name="email" label="email*" readonly="true"/>
		<s:textfield name="nombre" label="Nombre*"/>
		<s:textfield name="apellidos" label="Apellidos"/>
		<s:textfield name="feNacimiento" label="F.Nacimiento (dd/mm/yyyy)"/>
		<s:textfield name="direccion" label="Dirección"/>
		<s:textfield name="telefono1" label="Teléfono 1 (XXX-XXX-XXX)"/>
		<s:textfield name="telefono2" label="Teléfono 2 (XXX-XXX-XXX)"/>
		
		<s:submit value="Guardar"/>
		<s:submit value="Cancelar" action="listado"/>
	</s:form>
	<hr/>
</body>
</html>