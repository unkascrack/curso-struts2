<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-4.01 Validación Campos Servidor</title>
</head>
<body>
	<h4>Validación Campos Servidor SUCCESS!!!</h4>
	<hr/>    
	
	<s:actionmessage/>
    
	<table>
	<tr>
	    <td>Required Validator:</td>
	    <td><s:property value="requiredValidatorField" /></td>
	</tr>
	<tr>
	    <td>Required String Validator:</td>
	    <td><s:property value="requiredStringValidatorField" /></td>
	</tr>
	<tr>
	    <td>Integer Validator: </td>
	    <td><s:property value="integerValidatorField" /></td>
	</tr>
	<tr>
	    <td>Date Validator: </td>
	    <td><s:property value="dateValidatorField" /></td>
	</tr>
	<tr>
	    <td>Email Validator: </td>
	    <td><s:property value="emailValidatorField" /></td>
	</tr>
	<tr>
	    <td>String Length Validator: </td>
	    <td><s:property value="stringLengthValidatorField" /></td>
	</tr>
	<tr>
	    <td>Regex Validator:</td>
	    <td><s:property value="regexValidatorField" /></td>
	</tr>
	<tr>
		<td>Field Expression Validator:</td>
		<td><s:property value="fieldExpressionValidatorField" /></td>
	</tr>
	</table>
    
    <right>
    	<s:url var="urlMenu" action="menu" namespace="/"/>
    	<s:a href="%{urlMenu}">Volver</s:a>
    </right>
</body>
</html>

