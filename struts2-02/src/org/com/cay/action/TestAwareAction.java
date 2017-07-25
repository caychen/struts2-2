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
		
		//1、向application中添加一个属性,
		applicationMap.put("applicationKey2", "applicationValue2");
		
		//从application中读取一个属性，并打印
		System.out.println(applicationMap.get("date"));
		
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.applicationMap = arg0;
	}
}
