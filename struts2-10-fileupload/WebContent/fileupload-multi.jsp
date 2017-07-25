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
	<s:form action="testUpload2" enctype="multipart/form-data" theme="simple">
		<s:fielderror name="file"></s:fielderror>
		File: <s:file name="file" label="File"></s:file>
		Desc: <s:textfield name="desc[0]" label="Desc"></s:textfield>
		<br/>
		File: <s:file name="file" label="TXT File"></s:file>
		Desc: <s:textfield name="desc[1]" label="Desc"></s:textfield>
		<br/>		
		File: <s:file name="file" label="TXT File"></s:file>
		Desc: <s:textfield name="desc[2]" label="Desc"></s:textfield>
		<br/>
		<s:submit></s:submit>
	</s:form>
</body>
</html>