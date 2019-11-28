package com.testyantra.empapp.DAO;

import java.util.List;

import com.testyantra.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	
	
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean SearchEmployee(int id);
	
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
	
	
	

}
