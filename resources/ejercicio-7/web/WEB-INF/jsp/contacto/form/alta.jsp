<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="alta" namespace="/contacto">
	<s:fielderror fieldName="email"/>
	<tr>
		<td>
			<s:text name="email"/>*:
		</td>
		<td>
			<s:textfield name="email" required="true" theme="simple"/><s:property value="@es.curso.struts2.ejercicio7.util.Constantes@DOMINIO"/>
		</td>
	</tr>
	<s:textfield key="nombre" required="true"/>
	<s:textfield key="apellidos"/>
	<s:textfield key="fechaNacimiento"/>
	<s:submit key="alta"/>
</s:form>