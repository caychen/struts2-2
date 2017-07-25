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
		
		//1����ȡApplicaton��Ӧ��Map�������������һ������
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		
		//��ȡ����
		if(applicationMap.get("date") != null){
			Object object = applicationMap.get("date");
			System.out.println(object);
		}
		
		//2����ȡSession��Ӧ��Map�������������һ������
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		
		//3����ȡRequest��Ӧ��Map�������������һ������
		//ActionContext�в�û���ṩgetRequest��������ȡrequest��Ӧ��Map����Ҫ�ֹ�����get()����������request�ַ�������ȡ
		@SuppressWarnings("unchecked")
		Map<String, Object> requestMap = (Map<String, Object>)actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		//4����ȡ���������Ӧ��Map�������������һ������
		//����������������֣�ֵ�����������ֵ��Ӧ���ַ�����ɵ����飬�����Ҫ��ȡ����ֵ����Ҫת��ΪString[]��ȡ��Ӧ���±ꡣ
		Map<String, Object> parametersMap = actionContext.getParameters();
		System.out.println(parametersMap.get("name"));
		System.out.println(((String[])parametersMap.get("name"))[0]);
		
		//parameters���Map��ֻ�ܶ�������д����ʹд���ˣ�Ҳ���κ�Ч����
		parametersMap.put("age", 23);
		return SUCCESS;
	}
}
