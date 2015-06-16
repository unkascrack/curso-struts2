<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<ul>
	<li>parametro1 = <b>${param.parametro1}</b></li>
	<li>parametro2 = <b>${param.parametro2}</b></li>
	<li>parametro3 = <b>${param.parametro3}</b></li>
</ul>

<s:form>
	<s:textfield name="textfield" label="TextField"/>
	<s:textarea name="textarea" label="TextArea" rows="6" cols="20"/>
</s:form>