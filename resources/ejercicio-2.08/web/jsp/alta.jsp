<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.08 Validaci�n Datos Alta Usuarios</title>
</head>
<body>
	<h4>Alta Usuario</h4>
	<hr/>
	
	<s:form action="guardar" namespace="/">
		<s:textfield name="username" label="Username"/>
		<s:textfield name="password" label="Password"/>
		<s:textfield name="nombre" label="Nombre"/>
		<s:textfield name="apellidos" label="Apellidos"/>
		<s:textfield name="feNacimiento" label="F.Nacimiento (dd/mm/yyyy)"/>
		<s:textfield name="direccion" label="Direcci�n"/>
		<s:textfield name="telefono" label="Tel�fono (XXX-XXX-XXX)"/>
		<s:submit value="Guardar"/>
		<s:submit value="Cancelar" action="listado"/>
	</s:form>
</body>
</html>