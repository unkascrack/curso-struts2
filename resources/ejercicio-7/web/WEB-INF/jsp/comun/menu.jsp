<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="%{#session.usuario != null}">
	<table>
		<s:url var="urlAltaMensaje" action="nuevo" namespace="/mensaje"/>
		<tr><td><b><s:a href="%{urlAltaMensaje}">Redactar</s:a></b></td></tr>				
		<tr><td></td></tr>
	
		<s:iterator value="%{#session.directorios}">
			<s:url var="urlListaMensajes" action="lista" namespace="/mensaje">
				<s:param name="tipo" value="%{tipo}"/>
			</s:url>
		
			<tr>
				<td align="left" nowrap="nowrap">
					<s:a href="%{urlListaMensajes}">
						<s:if test="%{not mensajesSinLeer.isEmpty()}">
							<b><s:property value="tipo.text" escape="true"/> (<s:property value="mensajesSinLeer.size"/>)</b>
						</s:if>
						<s:else>
							<s:property value="tipo.text" escape="true"/>
						</s:else>
					</s:a>
				</td>
			</tr>
		</s:iterator>
	
		<tr><td><hr/></td></tr>
		<s:url var="urlContactos" action="lista" namespace="/contacto"/>
		<tr><td><b><s:a href="%{urlContactos}">Contactos</s:a></b></td></tr>
	</table>
</s:if>