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
	<s:form action="save.action">
		<s:hidden name="id"></s:hidden>
		<s:textfield name="person.username" label="UserName"></s:textfield>
		
		<!-- s:password中有个showPassword，如果为true，支持回显 -->
		<s:password name="person.password" label="Password"></s:password>
		<s:textfield name="person.age" label="Age"></s:textfield>
		
		<!-- 
			s:checkbox与html中的checkbox不同，
			s:checkbox会生成一个checkbox，并为之生成一个隐藏的checkbox，该隐藏的checkbox的value为true
			如果用户勾选s:checkbox，则会提交两个checkbox的值，均为true，则回显的时候s:checkbox的value则为true。
			而如果用户不勾选s:checkbox，则只会提交那个隐藏的checkbox，则回显的时候s:checkbox的value则为false。
		 -->
		<s:checkbox name="person.married" label="Married"></s:checkbox>
		<s:submit></s:submit>
	</s:form>
</body>
</html>