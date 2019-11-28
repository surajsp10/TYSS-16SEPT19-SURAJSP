package com.testyantra.empwebapp.util;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	
	
	private EmployeeDaoManager() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		
		
		return (EmployeeDAO) new EmployeeDaoJdbcImpl();
	}

}
