<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.09 Tag OptionTransferSelect</title>
</head>
<body>
	<h4>Tag OptionTransferSelect</h4>
	<hr/>
	
	<s:form action="optiontransferselect" namespace="/">	
		<s:optiontransferselect
			label="Selecciona tus marcas de Coche Favorito"
			leftTitle="Coches Favoritos"
			rightTitle="Coches No Favoritos"
			name="cochesFavoritos"
			list="cochesFavoritosDefecto"
			doubleName="cochesNoFavoritos"
			doubleList="cochesNoFavoritosDefecto" />
		<s:submit label="Enviar"/>
		<s:reset/>
	</s:form>
</body>
</html>