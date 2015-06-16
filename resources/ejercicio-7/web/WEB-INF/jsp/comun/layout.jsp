<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>    

<s:set name="isFormulario">${not empty param.formulario}</s:set>
<s:if test="%{#isFormulario}"><s:set name="formulario">${param.formulario}</s:set></s:if>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title><s:property value="@es.curso.struts2.ejercicio7.util.Constantes@DOMINIO.toUpperCase()" escape="true"/></title>
</head>
<body>

	<div align="right">
		<s:if test="%{#session.usuario != null}">
			<b><s:property value="%{#session.usuario.username}"/><s:property value="@es.curso.struts2.ejercicio7.util.Constantes@DOMINIO"/></b> |
			<s:url var="urlLogout" action="logout" namespace="/"/>
			<s:a href="%{urlLogout}"><s:text name="logout"/></s:a>	
		</s:if>
	</div>
	
	<h1><s:property value="@es.curso.struts2.ejercicio7.util.Constantes@DOMINIO.toUpperCase()" escape="true"/></h1>
	<hr/>
		<s:actionerror/>
		<s:actionmessage/>
	<hr/>
	
	<table width="100%">
	<tr>
		<td valign="top" align="left" width="120">
			<s:include value="/WEB-INF/jsp/comun/menu.jsp"/>
		</td>

		<td align="center" valign="top">
			<s:if test="%{#attr.formulario != null}">
				<s:include value="%{formulario}"/>
			</s:if>
		</td>
	</tr>
	</table>	

</body>
</html>