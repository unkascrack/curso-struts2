<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-5.01 Multiple File Upload</title>
	<s:head/>
</head>
<body>
	<h4>SUCCESS Multiple File Upload!!!</h4>
	<hr/>
	
	<s:actionmessage/>
	
	<s:if test="%{texto != null}">
		<h5>Textos (<s:property value="%{texto.length}"/>)</h6>
		<ul>
			<s:iterator var="t" value="%{texto}">
				<li><s:property value="%{t}"/><li/>
			</s:iterator>
		</ul>
	</s:if>
	
	<s:if test="%{archivo != null}">
		<h5>Archivos (<s:property value="%{archivo.length}"/>)</h6>
		<ul>
			<s:iterator var="a" value="%{archivoFileName}" status="status">
				<s:set var="index" value="#status.index"/>
				<li><s:property value="%{a}"/> (<s:property value="%{archivoContentType[#index]}"/>)<li/>
			</s:iterator>
		</ul>
	</s:if>	
	
	<right>
		<s:url var="urlMenu" action="menu" namespace="/"/>
		<s:a href="%{urlMenu}">Volver</s:a>
	</right>
</body>
</html>