package org.com.cay.action;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(username);
		return SUCCESS;
	}
}
