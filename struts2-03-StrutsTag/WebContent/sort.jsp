<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, org.com.cay.entity.User, org.com.cay.entity.UserComparator" %>        
<%@ taglib prefix="s" uri="/struts-tags" %>       
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
	
	<%
		request.setAttribute("comparator", new UserComparator());
	%>
	<s:property value="'before'"/><br/>
	<s:iterator value="#request.users">
		<s:property value="username"/>
		<s:property value="age"/>
		<br/>
	</s:iterator>
	<br/>
	<s:sort comparator="#request.comparator" source="#request.users" var="newUsers"></s:sort>
	<s:property value="'after'"/>
	<br/>
	<s:iterator value="#attr.newUsers">
		<s:property value="username"/>
		<s:property value="age"/>
		<br/>
	</s:iterator>
	
</body>
</html>