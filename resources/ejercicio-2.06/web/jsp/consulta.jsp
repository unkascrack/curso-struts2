<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.06 Listado-Alta-Consulta Usuarios (Convertidor Datos)</title>
</head>
<body>
	<h4>Consulta Usuario</h4>
	<hr/>
	<s:if test="%{usuario == null}">
		Error, no se encuentra el usuario solicitado.<br/>
	</s:if>
	<s:else>
		<table border="1" cellpadding="0" cellspacing="2">
		<tr>
			<td align="right">Id</td>
			<td align="left"><b><s:property value="usuario.id"/></b></td>
		</tr>
		<tr>
			<td align="right">Username</td>
			<td align="left"><b><s:property value="usuario.username"/></b></td>
		</tr>
		<tr>
			<td align="right">Nombre</td>
			<td align="left"><b><s:property value="usuario.nombre"/> <s:property value="usuario.apellidos"/></b></td>
		</tr>	
		<tr>
			<td align="right">F. Nacimiento</td>
			<td align="left"><b><s:date name="usuario.feNacimiento" format="dd MMMM yyyy"/></b></td>
		</tr>
		<tr>
			<td align="right">Dirección</td>
			<td align="left"><b><s:property value="usuario.direccion"/></b></td>
		</tr>
		<tr>
			<td align="right">Teléfono</td>
			<td align="left"><b><s:property value="usuario.telefono"/></b></td>
		</tr>
		</table>
	</s:else>
	<right>
		<s:url var="urlListado" action="listado" namespace="/"/>
		<s:a href="%{urlListado}">Volver</s:a>
	</right>
</body>
</html>