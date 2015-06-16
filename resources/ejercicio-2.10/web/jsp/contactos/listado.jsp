<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-2.10 Aplicación CRUD Contactos Segura</title>
</head>
<body>
	<h4>Listado Contactos</h4>
	
	<s:property value="%{#session.usuario.username}"/>
	<s:url var="urlLogout" action="logout" namespace="/usuarios"/>
	<s:a href="%{urlLogout}">Cerrar Sesión</s:a>
	<hr/>
	
	<right>
		<s:url var="urlAltaContacto" action="alta" namespace="/contactos"/>
		<s:a href="%{urlAltaContacto}">+Nuevo Contacto</s:a>
	</right>
	
	<s:if test="%{contactos.isEmpty()}">
		<p>No hay definido ningún contacto.<p/>
	</s:if>
	<s:else>
		<table width="100%" border="1" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<td align="center">email</td>
					<td align="center">Nombre</td>
					<td align="center">M</td>
					<td align="center">E</td>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="contactos">
				<tr>
					<td align="left">			
						<s:property value="email"/>				
					</td>
					<td align="left">
						<s:property value="nombre"/> <s:property value="apellidos"/>
					</td>
					<td align="center">
						<s:url var="urlModificarContacto" action="editar" namespace="/contactos">
							<s:param name="email" value="%{email}"/>
						</s:url>
						<s:a href="%{urlModificarContacto}">Modificar</s:a>
					</td>
					<td align="center">
						<s:url var="urlEliminarContacto" action="eliminar" namespace="/contactos">
							<s:param name="email" value="%{email}"/>
						</s:url>
						<s:a href="%{urlEliminarContacto}">Eliminar</s:a>
					</td>		
				</tr>
			</s:iterator>
			</tbody>
		</table>
	</s:else>
	<hr/>
</body>
</html>