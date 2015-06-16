<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.03 JSONResult Result Personalizado</title>
</head>
<body>
	<h4>JSONResult Result Personalizado!!!</h4>
	<hr/>
	
	<s:actionerror/>
	
	<s:action var="action" name="usuario" namespace="/" executeResult="false"></s:action>
	<ul>
		<s:iterator value="%{#action.usuarios}">
			<s:url var="urlUsuario" action="usuario" namespace="/">
				<s:param name="username" value="%{username}"/>
			</s:url>
			<li><s:a href="%{urlUsuario}"><s:property value="%{username}"/></s:a></li>
		</s:iterator>
	</ul>
</body>
</html>