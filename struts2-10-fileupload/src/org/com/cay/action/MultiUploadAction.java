package org.com.cay.action;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class MultiUploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<File> file;
	private List<String> fileContentType;
	private List<String> fileFileName;
	private List<String> desc;

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getDesc() {
		return desc;
	}

	public void setDesc(List<String> desc) {
		this.desc = desc;
	}

	public String execute() throws IOException {
		System.out.println(file);
		System.out.println(fileContentType);
		System.out.println(fileFileName);
		System.out.println(desc);

		// 类似单个文件上传，只是加入for循环
		/*
		 * ServletContext servletContext =
		 * ServletActionContext.getServletContext(); String dir =
		 * servletContext.getRealPath("/files/" + fileFileName);
		 * System.out.println("dir: " + dir); FileOutputStream fos = new
		 * FileOutputStream(dir); FileInputStream fis = new
		 * FileInputStream(file);
		 * 
		 * byte[] buffer = new byte[1024]; int len = 0; while ((len =
		 * fis.read(buffer)) != -1) { fos.write(buffer, 0, len); }
		 * 
		 * fis.close(); fos.close();
		 */
		return SUCCESS;
	}
}
