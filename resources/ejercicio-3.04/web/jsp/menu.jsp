<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Ejercicio-3.04 Cambio Theme</title>
</head>
<body>
	<h4>Theme <s:property value="theme"/></h4>
	<hr/>
	
	<s:actionerror theme="%{theme}"/>
	
	<s:url var="urlTheme" action="menu" namespace="/"/>
	<ul>
		<s:if test="%{theme != 'simple'}">
			<li>
				<s:a href="%{urlTheme}?theme=simple" theme="%{theme}">Theme SIMPLE</s:a>
			</li>
		</s:if>
		<s:if test="%{theme != 'xhtml'}">
			<li>
				<s:a href="%{urlTheme}?theme=xhtml" theme="%{theme}">Theme XHTML</s:a>
			</li>
		</s:if>
		<s:if test="%{theme != 'css_xhtml'}">
			<li>
				<s:a href="%{urlTheme}?theme=css_xhtml" theme="%{theme}">Theme CSS XHTML</s:a>
			</li>
		</s:if>
	</ul>
	
	<s:form theme="%{theme}">
		<s:textfield label="TextField" theme="%{theme}"/>
		<s:password label="TextPassword" theme="%{theme}"/>
		<s:textarea label="TextArea" theme="%{theme}" rows="6" cols="20"/>
	</s:form>
</body>
</html>