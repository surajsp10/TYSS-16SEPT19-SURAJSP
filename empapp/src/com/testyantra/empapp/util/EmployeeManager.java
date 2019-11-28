package com.testyantra.empapp.util;

import com.testyantra.empapp.DAO.EmployeeDAO;
import com.testyantra.empapp.DAO.EmployeeDAOImpl;

public class EmployeeManager {
	
	public static EmployeeDAO getEmployeeDAO() {
		
		
		return new EmployeeDAOImpl();
	}

}
