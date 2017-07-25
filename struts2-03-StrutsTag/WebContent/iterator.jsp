<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, org.com.cay.entity.Person" %>        
<%@ taglib prefix="s" uri="/struts-tags" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1, "AAA", 20));
		persons.add(new Person(2, "BBB", 30));
		persons.add(new Person(3, "CCC", 40));
		persons.add(new Person(4, "DDD", 50));
		request.setAttribute("persons", persons);
	%>
	<s:iterator value="#request.persons">
		<s:property value="username"/>:
		<s:property value="age"/>
	</s:iterator>
</body>
</html>