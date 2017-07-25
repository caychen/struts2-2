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
	
	private Integer id;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		/*
		 * 判断是Create 还是 Edit
		 * 如果为Create,则 employee = new Employee();
		 * 如果为Edit, 则employee = employeeDao.get(id);
		 * 判断标准为是否有id这个请求参数，如果有该请求参数，则视为Edit，否则视为Create
		 * 若通过id来判断，则需要在ModelDriven 拦截器之前先执行 Params拦截器
		 * 则可以通过配置默认的拦截器栈：paramsPrepareParamsStack
		 * 需要在struts.xml文件中配置使用paramsPrepareParamsStack作为默认的拦截器栈
		 * 
		 */
		if(id == null){
			employee = new Employee();
		}else{
			employee = employeeDao.get(id);
		}
		return employee;
	}
	
	public String list(){
		request.put("emps", employeeDao.getAll());
		return "list";
	}
	
	public String delete(){
		//System.out.println(id);
		employeeDao.delete(id);
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
		
		return "update";
	}
	
	public String update(){
		employeeDao.udpate(employee);
		return "success";
	}

}
