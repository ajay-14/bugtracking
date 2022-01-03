package com.bugtracking.employee.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Bug Entity")
@Entity
public class Bug{
	@Id
	private long bid;
	@NotEmpty
	@ApiModelProperty("name should not empty")
	private String bugDesc;
	@NotEmpty
	private String status;
	private Date startDate;
	private Date endDate;
	@ManyToOne
	private Employee employees;	
	@NotEmpty
	private String type;
	@NotEmpty
	private String priority;
	public long getBid() {
		return bid;
	}
	public String getBugDesc() {
		return bugDesc;
	}
	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	public Bug(long bid, String bugDesc, String status, Date startDate, Date endDate, Employee employees, String type,
			String priority) {
		super();
		this.bid = bid;
		this.bugDesc = bugDesc;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.priority = priority;
		this.employees=employees;
		}
	public Bug() {
		
	}
}
