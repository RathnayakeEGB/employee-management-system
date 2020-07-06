package com.emp.mgt.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int seq;
	private String empId;
	private String name;
	private String address ;
	private	List<Relatives> relativeList = new ArrayList<Relatives>();
	private Salary salaryInfo;
	private Supervisor supervisor;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		this.relativeList = new ArrayList<>();
	}

	public Employee(String empId, String name, String address, List<Relatives> relativeList, Salary salaryInfo,
			Supervisor supervisor) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.relativeList = relativeList;
		this.salaryInfo = salaryInfo;
		this.supervisor = supervisor;
		this.relativeList = new ArrayList<>();

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Relatives> getRelativeList() {
		return relativeList;
	}

	public void setRelativeList(List<Relatives> relativeList) {
		this.relativeList = relativeList;
	}

	public Salary getSalaryInfo() {
		return salaryInfo;
	}

	public void setSalaryInfo(Salary salaryInfo) {
		this.salaryInfo = salaryInfo;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
	

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", relativeList=" + relativeList
				+ ", salaryInfo=" + salaryInfo + ", supervisor=" + supervisor + "]";
	}
	
	
	

}
