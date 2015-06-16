<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="consulta" namespace="/mensaje">
	<s:textfield key="from" name="mensaje.from" required="true" readonly="true"/>
	<s:textfield key="to" name="mensaje.to" required="true" readonly="true"/>
	<s:textfield key="cc" name="mensaje.cc" readonly="true"/>
	<s:textfield key="bcc" name="mensaje.bcc" readonly="true"/>
	
	<s:date var="date" name="%{mensaje.date}" format="dd MMM yyyy HH:mm"/>
	<s:textfield key="date" readonly="true" required="true"/>
	
	<s:textfield key="subject" name="mensaje.subject" required="true" readonly="true"/>
	<s:textarea key="text" name="mensaje.text" cols="16" rows="6" readonly="true"/>
</s:form>