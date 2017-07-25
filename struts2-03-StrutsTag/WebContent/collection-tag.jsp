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
	
	<h3>
		Map类型数值作为list参数的时候：
			标签中的value属性值即为Map的key，显示文本即为Map的value
			<strong style="color:red;">注意：使用Map的时候，需要使用#</strong>
		<br/>	
		List类型数值作为list参数的时候：
			标签中的value属性值和显示文本即为List的单个value
		<br/>	
		以对象作为list参数的时候：
			指定listKey和listValue作为具体value和显示文本
	</h3>
	
	<!-- Map类型数值作为list参数 -->
	<s:radio list="#{'1':'Male', '0':'Female' }" name="person.gender" label="Gender"></s:radio>
	<br/>
	
	<!-- 以对象作为list参数 -->
	<s:checkboxlist name="person.favor" list="#request.persons" label="Person" listKey="id" listValue="username"></s:checkboxlist>
	
	<br/>
	<!-- 以List类型数值作为list参数 -->
	<s:select list="{'北京', '上海', '南京'}" name="person.city"></s:select>
	
	<jsp:include page="index.jsp"></jsp:include>
</body>
</html>