<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="login">
	<s:textfield key="login" required="true"/>
	<s:password key="password" required="true"/>
	<s:submit key="entrar"/>
</s:form>

<s:url var="nuevo_usuario" action="nuevo" namespace="/usuario"/>
<s:a href="%{nuevo_usuario}">Nuevo Usuario</s:a>