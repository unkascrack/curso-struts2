<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="alta" namespace="/usuario" validate="true">
	<s:textfield key="username" required="true"/>
	<s:password key="password" required="true"/>
	<s:textfield key="nombre" required="true"/>
	<s:textfield key="apellidos"/>
	<s:submit key="alta"/>
	<tr>
		<td colspan="2" align="left">
			<s:url var="url" action="menu" namespace="/"/>
			<s:a href="%{url}"><s:text name="cancel"/></s:a>			
		</td>
	</tr>
</s:form>