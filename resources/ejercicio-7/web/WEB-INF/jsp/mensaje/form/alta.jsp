<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="alta" namespace="/mensaje">
	<s:textfield key="to" name="mensaje.to" required="true"/>
	<s:textfield key="cc" name="mensaje.cc"/>
	<s:textfield key="bcc" name="mensaje.bcc"/>
	<s:textfield key="subject" name="mensaje.subject" required="true"/>
	<s:textarea key="text" name="mensaje.text" cols="16" rows="6"/>
	<s:submit key="enviar"/>
</s:form>