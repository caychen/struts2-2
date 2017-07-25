package org.com.cay.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.com.cay.entity.Employee;

public class EmployeeDao {

	private static Map<Integer, Employee> emps = new LinkedHashMap<Integer, Employee>();
	
	static{
		emps.put(1001, new Employee(1001, "AA", "aa", "aa@qq.com"));
		emps.put(1002, new Employee(1002, "BB", "bb", "bb@qq.com"));
		emps.put(1003, new Employee(1003, "CC", "cc", "cc@qq.com"));
		emps.put(1004, new Employee(1004, "DD", "dd", "dd@qq.com"));
		emps.put(1005, new Employee(1005, "EE", "ee", "ee@qq.com"));
	}
	
	public List<Employee> getAll(){
		return new ArrayList<Employee>(emps.values());
	}
	
	public void delete(Integer id){
		emps.remove(id);
	}
	
	public void add(Employee employee){
		employee.setId((int)System.currentTimeMillis());
		emps.put(employee.getId(), employee);
	}
	
	public void udpate(Employee employee){
		emps.put(employee.getId(), employee);
	}
	
	public Employee get(Integer id){
		return emps.get(id);
	}
}
