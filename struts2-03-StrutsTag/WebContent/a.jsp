<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ page import="java.util.List, java.util.ArrayList, org.com.cay.entity.User" %>            
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<User> users = new ArrayList<User>();
		users.add(new User("EEE", 60));
		users.add(new User("AAA", 20));
		users.add(new User("DDD", 50));
		users.add(new User("CCC", 40));
		users.add(new User("BBB", 30));
		request.setAttribute("users", users);
	%>
	
	<!-- 强制OGNL解析，使用%{}将属性包装 -->
	<s:iterator value="#request.users">
		<s:a href="getUser.action?name=%{username}"><s:property value="username"/> </s:a>
	</s:iterator>
</body>
</html>