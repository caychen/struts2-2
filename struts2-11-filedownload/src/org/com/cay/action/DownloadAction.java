package org.com.cay.action;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String contentType;
	private long contentLength;
	private String contentDisposition;
	private InputStream inputStream;
	
	public InputStream getInputStream(){
		return inputStream;
	}

	public String getContentType() {
		return contentType;
	}

	public long getContentLength() {
		return contentLength;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//确定各个成员变量的值
		contentType = "text/xml";
		contentDisposition = "attachment;filename=test.xml";
		
		ServletContext servletContext = ServletActionContext.getServletContext();
		String fileName = servletContext.getRealPath("/files/test.xml");
		inputStream = new FileInputStream(fileName);
		contentLength = inputStream.available();
		return SUCCESS;
	}
}
