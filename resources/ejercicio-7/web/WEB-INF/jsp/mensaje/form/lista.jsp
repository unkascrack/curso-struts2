<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="%{mensajes.isEmpty()}">
	No existe ning&uacute;n mensaje
</s:if>
<s:else>

	<jsp:useBean id="hoy" class="java.util.Date" scope="page"/>
	<s:date var="now" name="#attr.hoy" format="dd/MM/yyyy"/>

	<table width="100%" border="1" cellpadding="0" cellspacing="0">
	<s:iterator value="%{mensajes}">
		<tr>
			<td width="70" align="left">
				<s:url var="urlEliminarMensaje" action="eliminar" namespace="/mensaje">
					<s:param name="id" value="%{id}"/>
				</s:url>
				<s:a href="%{urlEliminarMensaje}" title="eliminar">
					<s:if test="%{not leido}">
						<b>eliminar</b>
					</s:if>
					<s:else>
						eliminar
					</s:else>				
				</s:a>				
			</td>
			<td width="200">
				<s:if test="%{tipoDirectorio == @es.curso.struts2.ejercicio7.model.TipoDirectorio@SENT}">
					<s:if test="%{not leido}">
						<b>Para: <s:property value="to" escape="true"/></b>
					</s:if>
					<s:else>
						Para: <s:property value="to" escape="true"/>
					</s:else>				
				</s:if>
				<s:else>
					<s:if test="%{not leido}">
						<b><s:property value="from" escape="true"/></b>
					</s:if>
					<s:else>
						<s:property value="from" escape="true"/>
					</s:else>				
				</s:else>
			</td>
			<td>
				<s:url var="urlConsultaMensaje" action="consulta" namespace="/mensaje">
					<s:param name="id" value="%{id}"/>
				</s:url>
				
				<s:a href="%{urlConsultaMensaje}">
					<s:if test="%{not leido}">
						<b><s:property value="subject" escape="true"/></b>
					</s:if>
					<s:else>
						<s:property value="subject" escape="true"/>
					</s:else>
				</s:a>
			</td>
			<td width="60" align="right">
				<s:date var="fecha" name="date" format="dd/MM/yyyy"/>
				<s:if test="%{not leido}">
					<s:if test="%{fecha == now}">
						<b><s:date name="date" format="HH:mm"/></b>
					</s:if>
					<s:else>
						<b><s:date name="date" format="dd MMM"/></b>
					</s:else>
				</s:if>
				<s:else>
					<s:if test="%{fecha == now}">
						<s:date name="date" format="HH:mm"/>
					</s:if>
					<s:else>
						<s:date name="date" format="dd MMM"/>
					</s:else>
				</s:else>
			</td>
		</tr>
	</s:iterator>
	</table>
</s:else>