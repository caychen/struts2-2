package org.com.cay.entity;

/**
 * 1. Department��ģ�ͣ�ʵ��¼���Department.deptName����ֱ��д��s:textfield��name������
 * 		��mgr������δ���
 * 	��struts2����ǩ��nameֵ���Ա���Ϊ���Ե����ԣ���name=mgr.name, name=mgr.birth
 * 
 * 2. mgr����һ��Date���͵�birth���ԣ�struts2��������Զ�������ת����
 *	��ȫ�ֵ�����ת������Ȼ������������.
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
