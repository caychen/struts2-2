package org.com.cay.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File file;
	private String fileContentType;
	private String fileFileName;
	private String desc;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	
	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String execute() throws IOException {
		System.out.println(file);
		System.out.println(fileContentType);
		System.out.println(fileFileName);
		System.out.println(desc);

		ServletContext servletContext = ServletActionContext.getServletContext();
		String dir = servletContext.getRealPath("/files/" + fileFileName);
		System.out.println("dir: " + dir);
		FileOutputStream fos = new FileOutputStream(dir);
		FileInputStream fis = new FileInputStream(file);

		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, len);
		}

		fis.close();
		fos.close();
		return SUCCESS;
	}
}
