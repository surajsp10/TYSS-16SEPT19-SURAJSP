package com.testyantra.employeeapp.dao;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.employeeapp.dto.beanobject.EmployeeBeans;

public class EmployeeDAOimpl   implements EmployeeDAO{

	

	@Override
	public EmployeeBeans SearchEmployee(int id) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql ="select * from employee where id=?";
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
				
				
				try {
					EmployeeBeans bean = new EmployeeBeans();
					Class.forName("com.mysql.jdbc.Driver");
					
					conn = DriverManager.getConnection(url);
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, id);
					rs = pstmt.executeQuery();
					
					
					if(rs.next()) {
			
						
						bean.setId(rs.getInt("id"));
//						int emp_id = rs.getInt("id");
						bean.setName(rs.getString("name"));
						bean.setSalary(rs.getInt("salary"));
						bean.setGender(rs.getString("gender"));
						
						
						return bean;
					}
					else {
						
						
						return null;
					}
					
				}catch (Exception e) {
					
				e.printStackTrace();
				return null;
				}finally {
					
					try {
						
						
						if(conn!=null)
							conn.close();

						if(pstmt!=null)
							pstmt.close();
						
					} catch (Exception e2) {
						e2.printStackTrace();
						// TODO: handle exception
					}
					
					// TODO: handle exception
				}
				
	}

}
