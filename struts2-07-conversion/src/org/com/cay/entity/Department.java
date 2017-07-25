package org.com.cay.entity;

/**
 * 1. Department是模型，实际录入的Department.deptName可以直接写到s:textfield的name属性中
 * 		而mgr属性如何处理？
 * 	答：struts2表单标签的name值可以被赋为属性的属性：如name=mgr.name, name=mgr.birth
 * 
 * 2. mgr中有一个Date类型的birth属性，struts2可以完成自动的类型转换吗？
 *	答：全局的类型转换器仍然可以正常工作.
 */
public class Department {

	private Integer id;
	private String deptName;
	
	private Manager mgr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Manager getMgr() {
		return mgr;
	}

	public void setMgr(Manager mgr) {
		this.mgr = mgr;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", mgr=" + mgr + "]";
	}
	
	
}
