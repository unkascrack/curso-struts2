<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.09 Tag OptionTransferSelect</title>
</head>
<body>
	<h4>Resultado Tag OptionTransferSelect</h4>
	<hr/>
	
	<table border="1" cellspacing="0" cellpadding="0">
	<tr>
        <td>Coches Favoritos:</td>
        <td>
        <s:iterator value="cochesFavoritos" status="stat">
            <s:property value="%{#stat.count}" />.<s:property /><br/>
        </s:iterator>
        </td>
    </tr>
    <tr>
        <td>Coches No Favoritos:</td>
        <td>
        <s:iterator value="cochesNoFavoritos" status="stat">
            <s:property value="%{#stat.count}" />.<s:property /><br/>
        </s:iterator>
        </td>
    </tr>
    </table>
    <right>
    	<s:url var="urlMenu" action="menu" namespace="/"/>
    	<s:a href="%{urlMenu}">Volver</s:a>
    </right>
</body>
</html>