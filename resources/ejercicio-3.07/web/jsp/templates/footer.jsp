<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<hr/>

<s:bean name="java.util.Date" var="hoy"/>
<s:date var="fecha" name="#hoy" format="dd/MM/yyyy"/>

<s:if test="%{#attr.footer != null}">
	${param.footer}
</s:if>
<s:else>
	<s:property value="%{fecha}"/>
</s:else>

<s:debug/>