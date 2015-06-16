<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.08 Action Chaining</title>
</head>
<body>
	<h4>Resultado Action Chaining</h4>
	<hr/>    
	
	<s:label label="Propiedad Action Chain 1" name="chain1ActionPropiedad"/><br/>
	<s:label label="Propiedad Action Chain 2" name="chain2ActionPropiedad"/><br/>
	<s:label label="Propiedad Action Chain 3" name="chain3ActionPropiedad"/><br/>
    
    <right>
    	<s:url var="urlMenu" action="menu" namespace="/"/>
    	<s:a href="%{urlMenu}">Volver</s:a>
    </right>
</body>
</html>

