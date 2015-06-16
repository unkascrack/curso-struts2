<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-5.01 Multiple File Upload</title>
	<s:head/>
</head>
<body>
	<h4>Multiple File Upload</h4>
	<hr/>
	
	<s:actionerror/>
	<s:fielderror/>
	
	<s:form action="upload" namespace="/" enctype="multipart/form-data">
		<s:textfield name="texto" label="Texto 1"/>
		<s:file name="archivo" label="Archivo 1"/>
		<s:textfield name="texto" label="Texto 2"/>
		<s:file name="archivo" label="Archivo 2"/>
		<s:textfield name="texto" label="Texto 3"/>
		<s:file name="archivo" label="Archivo 3"/>
		<s:submit label="Enviar"/>
		<s:reset label="Reset"/>				
	</s:form>
</body>
</html>