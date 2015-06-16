<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>  

<s:form action="eliminar" namespace="/contacto">
	<table width="100%">
	<tr>
		<td align="left">
			<s:if test="%{not contactos.isEmpty()}">
				<s:submit value="eliminar" theme="simple"/>
			</s:if>
		</td>
		<td align="right">
			<s:url var="urlAltaContacto" action="nuevo" namespace="/contacto"/>
			<s:a href="%{urlAltaContacto}">Nuevo Contacto</s:a>
		</td>
	</tr>
	</table>
	
	<s:if test="%{contactos.isEmpty()}">
		No existe ning&uacute;n contacto
	</s:if>
	<s:else>
		<table border="1" width="100%">
		<s:iterator value="%{contactos}">
			<tr>
				<td width="20" align="center"><s:checkbox name="id" theme="simple" fieldValue="%{id}" value="false"/></td>
				<td align="center" width="50">
					<s:url var="urlEliminarContacto" action="eliminar" namespace="/contacto">
						<s:param name="id" value="%{id}"/>
					</s:url>
					<s:a href="%{urlEliminarContacto}" title="eliminar">
						eliminar
					</s:a>
				</td>
				<td width="200">
					<s:url var="urlConsultaContacto" action="consulta" namespace="/contacto">
						<s:param name="id" value="%{id}"/>
					</s:url>
					<s:a href="%{urlConsultaContacto}">
						<s:property value="email" escape="true"/><s:property value="@es.curso.struts2.ejercicio7.util.Constantes@DOMINIO"/>
					</s:a>
				</td>
				<td><s:property value="nombre" escape="true"/> <s:property value="apellidos" escape="true"/></td>
				<td width="80" align="right"><s:date name="fechaNacimiento" format="dd/MM/yyyy"/></td>
			</tr>
		</s:iterator>
		</table>
	</s:else>
</s:form>