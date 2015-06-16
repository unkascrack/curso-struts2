<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.07 Login Interceptor</title>
</head>
<body>
	<h4>MENÚ PRINCIPAL</h4>
	<s:property value="%{#sesion.usuario.username}"/><br>
	<hr/>
	<i>Zona segura</i>
</body>
</html>