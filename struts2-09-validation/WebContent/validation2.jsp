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
	<!-- 要求年龄在1-130之间，需要单独为该jsp文件配置一个验证规则 -->
	<s:form action="testValidation2">
		<s:textfield name="age" label="Age"></s:textfield>
		<s:submit></s:submit>
	</s:form>
</body>
</html>