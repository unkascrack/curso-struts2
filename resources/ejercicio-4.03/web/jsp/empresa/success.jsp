<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-4.03 Validador CIF Personalizado</title>
</head>
<body>
	<h4>Validador CIF Personalizado SUCCESS!!!</h4>
	<hr/>    
	  
	<table>
	<tr>
	    <td>CIF Empresa:</td>
	    <td><s:property value="identificador"/></td>
	</tr>
	<tr>
	    <td>Nombre Empresa:</td>
	    <td><s:property value="nombre"/></td>
	</tr>
	</table>
    
    <right>
    	<s:url var="urlMenu" action="nueva" namespace="/empresa"/>
    	<s:a href="%{urlMenu}">Volver</s:a>
    </right>
</body>
</html>

