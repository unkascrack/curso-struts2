<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.09 Configuraci�n Personalizada y Exceptions</title>
</head>
<body>
	<h4>Error Throwable</h4>
	<hr/>
	
	<s:property value="exception"/><br/>
	<s:property value="exceptionStack"/><br/>
	 
	<s:url var="urlMenu" action="menu" namespace="/"/>
	<s:a href="%{urlMenu}">Volver al Men� Principal...</s:a>
</body>
</html>