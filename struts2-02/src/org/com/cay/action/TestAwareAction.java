package org.com.cay.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

import com.opensymphony.xwork2.ActionSupport;

public class TestAwareAction extends ActionSupport implements ApplicationAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Object> applicationMap;
	
	public String execute(){
		
		//1����application�����һ������,
		applicationMap.put("applicationKey2", "applicationValue2");
		
		//��application�ж�ȡһ�����ԣ�����ӡ
		System.out.println(applicationMap.get("date"));
		
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.applicationMap = arg0;
	}
}
