<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.06 Multiple Fields</title>
</head>
<body>
	<h4>Multiple Fields</h4>
	<hr/>
	
	<s:actionerror/>
	<s:fielderror/>
	
	<s:form action="multiplefields" namespace="/">
		<s:textfield name="textfield" label="TextField 1"/>
		<s:textarea name="textarea" label="TextArea 1"/>
		<s:checkbox name="checkbox" value="checkbox1" label="CheckBox 1"/>

		<s:textfield name="textfield" label="TextField 2"/>
		<s:textarea name="textarea" label="TextArea 2"/>
		<s:checkbox name="checkbox" value="checkbox2" label="CheckBox 2"/>
		
		<s:textfield name="textfield" label="TextField 3"/>
		<s:textarea name="textarea" label="TextArea 3"/>
		<s:checkbox name="checkbox" value="checkbox3" label="CheckBox 3"/>		

		<s:submit label="Enviar"/>
		<s:reset label="Reset"/>				
	</s:form>
</body>
</html>