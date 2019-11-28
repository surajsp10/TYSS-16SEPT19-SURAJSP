package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {

	
	public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.sql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "update employee set name=?,salary=?,gender=? where id=?";
			
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setString(3, gender);
			pstmt.setInt(2, sal);

			//int count = stmt.executeUpdate(sql);
			//query should not be passed here as it is passed in prepareStatement 
			int count  = pstmt.executeUpdate();
			
			
			System.out.println(count + " Row(s) affected");
			
			
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			
			
			try {
				
				if(conn!=null) {
					conn.close();
				}
//				if(stmt!=null) {
//					stmt.close();
//				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
