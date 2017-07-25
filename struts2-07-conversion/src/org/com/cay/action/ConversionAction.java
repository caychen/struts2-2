package org.com.cay.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ConversionAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private Date birth;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String execute(){
		System.out.println("age: " + age);
		System.out.println("birth: " + birth);
		return "success";
	}
	
	/*@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}*/
}
