<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.02 Site Seguro</title>
</head>
<body>
	<s:if test="%{#session.usuario == null}">
		<s:actionerror/>
		<s:actionmessage/>
		<s:form action="login">
			<s:textfield name="username" label="Usuario"/>
			<s:password name="password" label="Contraseña"/>
			<s:submit value="Entrar"/>
		</s:form>	
	</s:if>
	<s:else>
		<b><s:property value="#session.usuario"/></b><br/>
		<s:url var="urlLogout" action="logout" namespace="/"/>
		<s:a href="%{urlLogout}">Cerrar Sesión</s:a>		
	</s:else>
	<hr/>
	
	<pre>
		ipsum lorem
	</pre>
	<hr/>
	<s:if test="%{#session.usuario == null}">
		<b>Necesitas estar registrado para poder visualizar esta Zona.</b>
	</s:if>
	<s:else>
		<b>Esta registrado ya puede visualizar la Zona Segura!!!</b>		
	</s:else>
	<hr/>
	
	<pre>
		ipsum lorem
	</pre> 
</body>
</html>