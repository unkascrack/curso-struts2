<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.01 Login</title>
</head>
<body>
	<hr/>
	<h4>Login</h4>
	<s:form action="registro">
		<s:actionerror/>
		<s:actionmessage/>
		<s:textfield name="username" label="Usuario"/>
		<s:password name="password" label="Contraseña"/>
		<s:submit value="Entrar"/> <s:reset value="Reset"/>
	</s:form>
	<hr/>
</body>
</html>