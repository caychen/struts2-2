<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<!-- 要求年龄在20-50之间 -->
	<s:form action="testValidation">
		<s:textfield name="age" label="Age"></s:textfield>
		<s:fielderror fieldName="age"></s:fielderror>
		
		<s:password name="password" label="Password"></s:password>
		<s:password name="password2" label="RePassword"></s:password>
		<s:actionerror/>
		
		<s:textfield name="count" label="Count"></s:textfield>
		<s:fielderror fieldName="count"></s:fielderror>
		
		<s:textfield name="idCard" label="IdCard"></s:textfield>
		<s:fielderror name="idCard"></s:fielderror>
		<s:submit></s:submit>
	</s:form>
</body>
</html>