<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.09 Configuración Personalizada y Exceptions</title>
</head>
<body>
	<h4>Menú Principal</h4>
	<hr/>
	
	<ul>
		<li>
			<s:url var="urlException1" action="exception1" namespace="/"/>
			<s:a href="%{urlException1}">Exception 1 (java.lang.Exception)</s:a>		
		</li>
		<li>
			<s:url var="urlException2" action="exception2" namespace="/"/>
			<s:a href="%{urlException2}">Exception 2 (java.lang.SecurityException)</s:a>		
		</li>
		<li>
			<s:url var="urlException3" action="exception3" namespace="/"/>
			<s:a href="%{urlException3}">Exception 3 (java.lang.Throwable)</s:a>		
		</li>				
	</ul>
</body>
</html>