package com.bugtracking.employee.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
public class Employee {
	@Id
	private long empId;
	@NotEmpty
	private String empName;
	@NotEmpty
	private String email;
	@NotEmpty
	private String contactNo;
	private long projectId;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public Employee(long empId, String empName, String email, String contactNo, long projectId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.contactNo = contactNo;
		this.projectId = projectId;
	}
	public Employee() {
		
	}
}
