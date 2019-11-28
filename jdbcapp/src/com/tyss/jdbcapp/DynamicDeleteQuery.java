package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
 
	
	public static void main(String[] args) {
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
//			Driver driver = new Driver();"
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "delete from employee where id=?";
			
//			stmt = conn.createStatement();
//			int count = stmt.executeUpdate(sql);
			pstmt = conn.prepareStatement(sql);
	
			
			String empid = args[0];
			//int id = Integer.parseInt(empid);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "Row(s) deleted");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
		
		
	}
}
