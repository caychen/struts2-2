package org.com.cay.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.com.cay.dao.EmployeeDao;
import org.com.cay.entity.Employee;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction implements ModelDriven<Employee>, RequestAware, Preparable{

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
		 * �ж���Create ���� Edit
		 * ���ΪCreate,�� employee = new Employee();
		 * ���ΪEdit, ��employee = employeeDao.get(id);
		 * �жϱ�׼Ϊ�Ƿ���id����������������и��������������ΪEdit��������ΪCreate
		 * ��ͨ��id���жϣ�����Ҫ��ModelDriven ������֮ǰ��ִ�� Params������
		 * �����ͨ������Ĭ�ϵ�������ջ��paramsPrepareParamsStack
		 * ��Ҫ��struts.xml�ļ�������ʹ��paramsPrepareParamsStack��ΪĬ�ϵ�������ջ
		 * 
		 */
		
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
	
	public void prepareAdd(){
		employee = new Employee();
	}
	
	public String updateForm(){
		return "update";
	}
	
	public void prepareUpdateForm(){
		employee = employeeDao.get(id);
	}
	
	public String update(){
		employeeDao.udpate(employee);
		return "success";
	}
	
	public void prepareUpdate(){
		employee = new Employee();
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

}