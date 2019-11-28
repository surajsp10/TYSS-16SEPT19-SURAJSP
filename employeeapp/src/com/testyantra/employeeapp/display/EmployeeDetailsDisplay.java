package com.testyantra.employeeapp.display;

import com.testyantra.employeeapp.dao.*;


public class EmployeeDetailsDisplay {
	

	
	public static EmployeeDAO getEmployeeDAO() {
		
		
		return new EmployeeDAOimpl();
	}
}
