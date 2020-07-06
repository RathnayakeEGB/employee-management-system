package com.emp.mgt.entities;

import java.util.List;

public class Supervisor {
	
	private String supId;
	private String name;
	private List<Employee> employeeList;
	
	
	
	public Supervisor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Supervisor(String supId, String name, List<Employee> employeeList) {
		super();
		this.supId = supId;
		this.name = name;
		this.employeeList = employeeList;
	}



	public String getSupId() {
		return supId;
	}



	public void setSupId(String supId) {
		this.supId = supId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Employee> getEmployeeList() {
		return employeeList;
	}



	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}



	@Override
	public String toString() {
		return "Supervisor [supId=" + supId + ", name=" + name + ", employeeList=" + employeeList + "]";
	}
	
	
	
	

}
