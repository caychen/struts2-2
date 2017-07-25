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
	<s:url action="getPerson" var="url1"></s:url>
	<s:property value="url1"/><!-- 打印该url -->
	
	<br/>
	<%
		request.setAttribute("name", "Cay");
	%>
	<s:url action="getPerson" var="url2">
		<!-- OGNL取值并解析 -->
		<s:param name="name" value="#request.name"></s:param>
		<!-- 数值常量 -->
		<s:param name="age" value="10"></s:param>
		<!-- 取消OGNL解析，需要加上单引号 -->
		<s:param name="gender" value="'male'"></s:param>
	</s:url>
	<s:property value="url2"/>
</body>
</html>