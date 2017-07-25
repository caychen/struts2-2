package org.com.cay.action;

import org.com.cay.entity.Department;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestComplexPropertyAction extends ActionSupport implements ModelDriven<Department> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Department department;

	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		department = new Department();
		return department;
	}

	public String execute(){
		System.out.println(department);
		return SUCCESS;
	}
}
