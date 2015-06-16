<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><s:text name="global.title"/></title>
</head>
<body>
	<h4><s:text name="global.titulo"/></h4>
	<hr/>
	
	<ul>
		<li><b>OGNL getText:</b> <s:property value="%{getText('property.mensaje')}"/></li>
		<li><b>Action Property:</b> <s:property value="mensaje"/></li>
		<li><b>Class:</b> <s:text name="class.mensaje"/></li>
		<li><b>Interface:</b> <s:text name="interface.mensaje"/></li>
		<li><b>Package:</b> <s:text name="package.mensaje"/></li>
		<li><b>Global:</b> <s:text name="global.mensaje"/></li>
	</ul>	
</body>
</html>