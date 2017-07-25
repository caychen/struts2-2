<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.com.cay.entity.Person" %>    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Person person = new Person(1, "Cay", 12);
		request.setAttribute("person", person);
	%>

	<h3>s:push:进入标签的时候，向值栈中压入一个对象，结束标签的时候，再将该对象弹出值栈</h3>
	UserName: --
	<s:push value="#request.person">
		<s:property value="username"/>
	</s:push> --
</body>
</html>