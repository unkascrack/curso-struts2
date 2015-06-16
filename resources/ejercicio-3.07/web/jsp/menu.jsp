<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<s:include value="/jsp/templates/head.jsp">
		<s:param name="title">Ejercicio 3.07 Plantillas</s:param>
	</s:include>
<body>
	<s:include value="/jsp/templates/titulo.jsp">
		<s:param name="titulo">Plantillas</s:param>
	</s:include>

	<s:include value="/jsp/templates/formulario.jsp">
		<s:param name="parametro1">Valor del Parámetro 1</s:param>
		<s:param name="parametro2">Valor del Parámetro 2</s:param>
		<s:param name="parametro3">Valor 3</s:param>
	</s:include>
	
	<s:include value="/jsp/templates/footer.jsp"/>
</body>
</html>
	
