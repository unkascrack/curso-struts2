<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.06 Multiple Fields</title>
</head>
<body>
	<h4>SUCCESS Multiple Fields!!!</h4>
	<hr/>
	
	<s:actionmessage/>
	
	<s:if test="%{textfield.length > 0}">
		<h5>TextFields (<s:property value="%{textfield.length}"/>)</h6>
		<ul>
			<s:iterator var="t" value="%{textfield}">
				<li><s:property value="%{t}"/><li/>
			</s:iterator>
		</ul>
	</s:if>
	
	<s:if test="%{textarea.length > 0}">
		<h5>TextArea (<s:property value="%{textarea.length}"/>)</h6>
		<ul>
			<s:iterator var="t" value="%{textarea}">
				<li><s:property value="%{t}"/><li/>
			</s:iterator>
		</ul>
	</s:if>
	
	<s:if test="%{checkbox.length > 0}">
		<h5>Checkbox (<s:property value="%{checkbox.length}"/>)</h6>
		<ul>
			<s:iterator var="t" value="%{checkbox}">
				<li><s:property value="%{t}"/><li/>
			</s:iterator>
		</ul>
	</s:if>
	
	<right>
		<s:url var="urlMenu" action="menu" namespace="/"/>
		<s:a href="%{urlMenu}">Volver</s:a>
	</right>
</body>
</html>