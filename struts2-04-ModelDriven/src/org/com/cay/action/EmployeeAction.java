package org.com.cay.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.com.cay.dao.EmployeeDao;
import org.com.cay.entity.Employee;

import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction implements ModelDriven<Employee>, RequestAware{

	private EmployeeDao employeeDao = new EmployeeDao();
	
	private Employee employee;
	private Map<String, Object> request;
	
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		employee = new Employee();
		return employee;
	}
	
	public String list(){
		request.put("emps", employeeDao.getAll());
		return "list";
	}
	
	public String delete(){
		//System.out.println(employee.getId());
		employeeDao.delete(employee.getId());
		return "success";
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}
	
	public String add(){
		employeeDao.add(employee);
		return "success";
	}
	
	public String updateForm(){
		
		Employee emp = employeeDao.get(employee.getId());
		
		//把栈顶对象的属性装配好，此时栈顶对象是employee
		//目前栈顶对象的属性只有id属性，其他属性为null
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		employee.setEmail(emp.getEmail());
		return "update";
	}
	
	public String update(){
		employeeDao.udpate(employee);
		return "success";
	}

}
