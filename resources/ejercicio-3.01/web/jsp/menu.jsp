<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.01 Result Stream</title>
</head>
<body>
	<h4>Result Stream!!!</h4>
	<hr/>
	
	<s:actionerror/>
	
	<s:url var="urlStream" action="stream" namespace="/"/>
	<ul>
		<li>
			<s:a href="%{urlStream}">Descargar el archivo...</s:a>
		</li>
		<li>
			<s:a href="%{urlStream}?path=archivo_noexiste">Fallo al descargar el archivo...</s:a>
		</li>
	</ul>
</body>
</html>