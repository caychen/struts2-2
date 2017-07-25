package org.com.cay.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestActionContextAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute(){
		ActionContext actionContext = ActionContext.getContext();
		
		//1、获取Applicaton对应的Map，并向其中添加一个属性
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		
		//获取属性
		if(applicationMap.get("date") != null){
			Object object = applicationMap.get("date");
			System.out.println(object);
		}
		
		//2、获取Session对应的Map，并向其中添加一个属性
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		
		//3、获取Request对应的Map，并向其中添加一个属性
		//ActionContext中并没有提供getRequest方法来获取request对应的Map，需要手工调用get()方法，传入request字符串来获取
		@SuppressWarnings("unchecked")
		Map<String, Object> requestMap = (Map<String, Object>)actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		//4、获取请求参数对应的Map，并向其中添加一个属性
		//键：请求参数的名字，值：请求参数的值对应的字符串组成的数组，如果需要获取具体值，需要转换为String[]后取对应的下标。
		Map<String, Object> parametersMap = actionContext.getParameters();
		System.out.println(parametersMap.get("name"));
		System.out.println(((String[])parametersMap.get("name"))[0]);
		
		//parameters这个Map，只能读，不能写，即使写入了，也无任何效果！
		parametersMap.put("age", 23);
		return SUCCESS;
	}
}
