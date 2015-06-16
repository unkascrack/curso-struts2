<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.05 Listado-Alta-Consulta Usuarios</title>
</head>
<body>
	<h4>Listado Usuarios</h4>
	<hr/>
	
	<right>
		<s:url var="urlAltaUsuario" action="alta" namespace="/"/>
		<s:a href="%{urlAltaUsuario}">+Nuevo Usuario</s:a>
	</right>
	<table width="100%" border="1" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<td align="center">Username</td>
				<td align="center">Nombre</td>
				<td align="center">F. Nacimiento</td>
				<td align="center">Dirección</td>
				<td align="center">Teléfono</td>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="%{usuarios}">
			<s:url var="urlConsultaUsuario" action="consulta" namespace="/">
				<s:param name="id" value="%{id}"/>
			</s:url>		
		
			<tr>
				<td align="left">			
					<s:a href="%{urlConsultaUsuario}"><s:property value="username"/></s:a>				
				</td>
				<td align="left">
					<s:a href="%{urlConsultaUsuario}"><s:property value="nombre"/> <s:property value="apellidos"/></s:a>
				</td>
				<td align="center">
					<s:date name="feNacimiento" format="dd MMMM yyyy"/>
				</td>
				<td align="left">
					<s:property value="direccion"/>				
				</td>
				<td align="center">
					<s:property value="telefono"/>				
				</td>			
			</tr>
		</s:iterator>
		</tbody>
	</table>
</body>
</html>