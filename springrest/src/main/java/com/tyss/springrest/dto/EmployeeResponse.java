package com.tyss.springrest.dto;

import java.util.List;

public class EmployeeResponse {
	
	private int statuscode;
	private String message;
	private String description;
	public List<EmployeeBean> employeebeans;
	public List<EmployeeBean> getEmployeebeans() {
		return employeebeans;
	}
	public void setEmployeebeans(List<EmployeeBean> employeebeans) {
		this.employeebeans = employeebeans;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
