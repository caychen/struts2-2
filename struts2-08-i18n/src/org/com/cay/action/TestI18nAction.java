package org.com.cay.action;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestI18nAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date date = null;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String execute() {

		date = new Date();

		// 1. ��Action�з��ʹ��ʻ���Դ�ļ���valueֵ
		String username = getText("username");
		System.out.println(username);

		// 2. ����ռλ��
		String time = getText("time", Arrays.asList(date));
		System.out.println(time);

		return SUCCESS;
	}
}
