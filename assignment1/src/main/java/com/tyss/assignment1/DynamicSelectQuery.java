package com.tyss.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	
	public static void main(String[] args) {
		
		
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee where id = ?";
		
		Connection conn  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		
		try {
			
			//step1
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2
			conn = DriverManager.getConnection(url);
			
			
			//step3 issue query
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			
			rs = pstmt.executeQuery();
			
			//Step4 read the result
			
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("salary");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				
				System.out.println("ID is "+emp_id);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is "+gender);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			try {
				
				
				if(conn!=null)
					conn.close();
				if(rs!=null)
					rs.close();
				
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}//end of try-catch finally
		
	}//end main
}//end of DynamicSelectQuery
