<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.05 Formato Fechas</title>
</head>
<body>
	<h4>Formato Fechas</h4>
	<hr/>
	
	<s:actionerror/>

	<ul>
		<li>
			<b>Uso Tag JSP jsp:useBean</b><br/>
			<jsp:useBean id="hoy" class="java.util.Date" scope="page"/>
			Hoy (formato original): <s:property value="#attr.hoy"/><br/>
			Hoy (dd-MMM-yyyy HH:mm): <s:date name="#attr.hoy" format="dd-MMM-yyyy HH:mm"/><br/>
			Hoy (dd MMMM yyyy): <s:date name="#attr.hoy" format="dd MMMM yyyy"/><br/>
			Hoy (dd/MM/yyyy): <s:date name="#attr.hoy" format="dd/MM/yyyy"/><br/><br/>
		</li>
		<li>
			<b>Uso Tag Struts 2 s:bean</b><br/>
			<s:bean name="java.util.Date" var="hoy"/>
			Hoy (formato original): <s:property value="#attr.hoy"/><br/>
			Hoy (dd-MMM-yyyy HH:mm): <s:date name="#attr.hoy" format="dd-MMM-yyyy HH:mm"/><br/>
			Hoy (dd MMMM yyyy): <s:date name="#attr.hoy" format="dd MMMM yyyy"/><br/>
			Hoy (dd/MM/yyyy): <s:date name="#attr.hoy" format="dd/MM/yyyy"/><br/><br/>	
		</li>		
	</ul>
	
	<right>
		<s:url var="urlMenu" action="menu" namespace="/"/>
		<s:a href="%{urlMenu}">Recargar</s:a>
	</right>
</body>
</html>