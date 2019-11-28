package com.testyantra.empwebapp.dao;

import com.testyantra.empwebapp.dto.EmployeeInfo;

public interface EmployeeDAO {

	public EmployeeInfo auth(int id,String password);
	
	
	public EmployeeInfo searchEmployee(int id);
	
	public boolean changePassword(int id,String password);
	//employee object is passed
	public boolean registerEmployee(EmployeeInfo info);
	
}
