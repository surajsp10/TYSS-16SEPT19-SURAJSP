package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class ExecuteInsertQuery {

	
	public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			//Step 1:Load the driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			//Step 2 :Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			//Step 3 :Issue SQL Query
			//String sql = "insert into employee values(7,'sridhara',10000,'M')";
			String sql = "insert into employee values(?,?,?,?)";
			
//			stmt = conn.createStatement();
//			int count = stmt.executeUpdate(sql);
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			
			String name = args[1];
			pstmt.setString(2,name);
			
			String salary = args[2];
			int sal = Integer.parseInt(salary);
			pstmt.setInt(3, sal);
			
			
			String gender = args[3];
			pstmt.setString(4,gender);
			
			
			
			
			
			
			//Step 4 :Read the result
			
			int count = pstmt.executeUpdate();
			System.out.println(count +" Row(s) inserted ");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			try {
				
				if(conn!=null)
					conn.close();
//				if(stmt!=null)
//					stmt.close();
				if(pstmt!=null)
					pstmt.close();
				
			}catch(SQLException e) {
				
				
				e.printStackTrace();
			}
		}
		
	}//end of main
}//end of class
