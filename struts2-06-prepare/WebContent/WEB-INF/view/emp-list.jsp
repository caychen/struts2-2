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
	<s:form action="emp-add">
		<s:textfield name="firstName" label="FirstName"></s:textfield>
		<s:textfield name="lastName" label="LastName"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	<br/><br/>
	<table cellpadding="10" cellspacing="0" border="1">
		<thead>
			<tr>
				<td>ID</td>
				<td>firstName</td>
				<td>lastName</td>
				<td>email</td>
				<td>update</td>
				<td>delete</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="#request.emps">
				<tr>
					<td><s:property value="id"/> </td>
					<td><s:property value="firstName"/> </td>
					<td><s:property value="lastName"/> </td>
					<td><s:property value="email"/> </td>
					<td><a href="emp-updateForm.action?id=${id }">update</a></td>
					<td><a href="emp-delete.action?id=${id }">delete</a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>