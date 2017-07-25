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

	<!-- 
		问题1、如何覆盖默认的错误提示信息？
		答：在对应的Action类所在的包中新建ActionClassName.properties文件，ActionClassName即为包含着输入字段的Action的类名
			在属性文件中添加如下键值对：invalid.fieldvalue.fieldName=xxx,例如age属性，则建立invalid.fieldvalue.age=年龄非法	
			
		问题2、如果是simple主题，还会自动提示错误信息吗？如果不显示，如何解决？
		答：不会。
			1).通过s:debug标签，可知若转换出错，则在值栈的Action(实现了ValidationAware接口)对象中有一个fieldErrors属性，
				该属性的类型为Map<String, List<String>>键值对，其中键为字段属性名，值为错误提示信息组成的List，
				所以可以使用el或者OGNL表达式来提示错误信息，${fieldErrors.age[0]}
				
			2).还可以通过s:fielderror标签来显示,需要通过fieldName属性来指定字段的错误
			
		问题3、若是simple主题，且使用<s:fielderror fieldName="age"></s:fielderror>来显示错误信息，则该信息在一个ul，li，span中
		如何去除ul，li，span标签？
		答：在struts2-core.jar下的template.simple包下面的fielderror.ftl文件中定义了simple主题下的fielderror标签显示错误信息的样式，
			所以修改该配置文件即可。
		方法：在src下新建template.simple包，新建fielderror.ftl文件，
			把原生的fielderror.ftl文件中的内容复制到新建的fielderror.ftl中，然后把ul，li，span的部分内容删除。
		
		问题4、如何自定义类型转换器？
			1)、为什么需要自定义类型转换器？因为struts不能自动完成字符串到引用类型的转换
			2)、如何定义类型转换器：
				(1)、开发类型转换器的类：扩展StrutsTypeConvert类
				(2)、配置类型转换器：
					i、基于字段的配置：
						> 在需要转换的字段所在的Model(Action或者JavaBean)的包下，新建一个ModelClassName-conversion.properties文件
						> 在该文件中输入键值对：fieldName=类型转换器的全类名
							birth=org.com.cay.converter.DateConverter
						> 在第一次使用该转换器的时候创建实例；
						> 该类型转换器是单例的。
							
					ii、基于类型的配置(全局类型转换器)：
						> 在src下新建xwork-conversion.properties
						> 在该文件中输入：待转换的类型=类型转换器的全类名
							java.util.Date=org.com.cay.converter.DateConverter
						> 在当前struts2运用被加载时创建实例。
						
	 -->
	 <s:debug></s:debug>
	<s:form action="testConversion" theme="simple">
		Age:<s:textfield name="age" label="Age"></s:textfield>
		${fieldErrors.age[0] }
		@<s:fielderror fieldName="age"></s:fielderror>
		<br/>
		Birth:<s:textfield name="birth"></s:textfield>
		<s:fielderror fieldName="birth"></s:fielderror>
		<br/>
		<s:submit></s:submit>
	</s:form>
</body>
</html>