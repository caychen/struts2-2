<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="TestActionContextAction.action?name=Cay">Test ActionContextAction</a>
	<br/><br/>
	<a href="TestAwareAction.action?name=Cay">Test Aware</a>
	
	<%
		if(application.getAttribute("date") == null)
			application.setAttribute("date", new Date());
	%>
</body>
</html>