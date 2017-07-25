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
	
	<s:a href="testI18n.action?request_locale=en_US">English</s:a>
	<s:a href="testI18n.action?request_locale=zh_CN">中文</s:a>
	<br/>
	<s:a href="index.jsp">Index Page</s:a>

	<s:debug></s:debug>
	<s:form action="">
		<!-- label的方式是把label写死在表单里 -->
		<s:textfield name="username" label="Username"></s:textfield>
		<!-- 
			若label标签使用%{getText('username')}的方式，就也可以从国际化资源文件中获取对应的value值，
			因为此时在对象栈中有DefaultTextProvider的一个实例，该对象中提供了访问国际化资源的getText()方法，
			同时还需要通知struts2框架，label属性值中不再是普通的字符串值，而是一个OGNL表达式，
			所以使用%{}把getText()包装起来，以强制进行OGNL解析
		 -->
		<s:textfield name="username" label="%{getText('username')}"></s:textfield>
		
		<!-- key的方式是按照国际化资源里直接获取value值 -->
		<s:textfield name="username" key="username"></s:textfield>
		<s:textfield name="password" key="password"></s:textfield>
		
		
		<s:text name="time">
			<s:param value="date"></s:param>
		</s:text>
		<br/>
		
		<s:text name="time2"></s:text>
		
		<s:submit key="submit"></s:submit>
	</s:form>
	<hr/>
	
	<!-- 使用simple主题 -->
	<s:form action="" theme="simple">
		<!-- 使用simple主题后，页面上需要<s:text name=''></s:text>标签来访问国际化资源文件里的value值 -->
		<s:text name="username"></s:text>:
		<s:textfield name="username" label="%{getText('username')}"></s:textfield>
		<br/>
		<s:text name="username"></s:text>:
		<s:textfield name="username" key="username"></s:textfield>
		<br/>
		<s:text name="password"></s:text>:
		<s:textfield name="password" key="password"></s:textfield>
		<br/>
		<s:submit key="submit" value="%{getText('submit')}"></s:submit>
	</s:form>
</body>
</html>