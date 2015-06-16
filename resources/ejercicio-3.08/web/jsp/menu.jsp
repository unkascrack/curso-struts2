<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.08 Action Chaining</title>
</head>
<body>
	<h4>Action Chaining</h4>
	<hr/>
	
	<s:url var="urlActionChain" action="chainAction1" namespace="/chain-action"/>
	<s:a href="%{urlActionChain}">Invocar Action Chainning...</s:a>
</body>
</html>