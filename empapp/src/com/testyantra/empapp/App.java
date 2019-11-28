package com.testyantra.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.testyantra.empapp.DAO.EmployeeDAO;
import com.testyantra.empapp.DAO.EmployeeDAOImpl;
import com.testyantra.empapp.dto.EmployeeBean;
import com.testyantra.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Press 1 for getting all employee data ");
		System.out.println("Press 2 for Updating employee data ");
		System.out.println("Press 3 for inserting employee data ");
		System.out.println("Press 4 for deleting employee data ");
		System.out.println("Press 5 for searching single employee data ");
		
		
		
		Scanner scn =new Scanner(System.in);
		int ch = scn.nextInt();
		
		
		switch(ch) {
		
		case 1 :EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		List<EmployeeBean> result = dao.getAllEmployeeData();
		
		for(EmployeeBean bean : result) {
			System.out.println("Id "+bean.getId());
			System.out.println("Name "+bean.getName());
			System.out.println("Salary "+bean.getSal());
			System.out.println("Gender "+bean.getGender());
			
		}
		
				break;
		
		case 2 :
			
			
			break;
			
			
		case 3 :
			
			break;
			
			
		case 4 : 
			
			
			break;
			
			
		case 5 : 
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean = dao5.SearchEmployee(id);
			
			
			
			if(bean!=null) {
				System.out.println("Id "+bean.getId());
				System.out.println("Name "+bean.getName());
				System.out.println("Salary "+bean.getSal());
				System.out.println("Gender "+bean.getGender());
				
			}
			else {
				
				
				System.out.println("No data found");
			}
			break;
				
				
			
			
			
			
		}//end of switch
		
	

	}//end of main
}//end of class8
