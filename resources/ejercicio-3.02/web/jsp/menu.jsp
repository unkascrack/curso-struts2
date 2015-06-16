<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.02 Result PlainText</title>
</head>
<body>
	<h4>Result PlainText!!!</h4>
	<hr/>
	
	<s:actionerror/>
	
	<s:url var="urlPlainText" action="plaintext" namespace="/"/>
	<ul>
		<li>
			<s:a href="%{urlPlainText}">Ver el contenido del archivo "menu.jsp"</s:a>
		</li>
	</ul>
</body>
</html>