package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQueryWithProperty {

	
	public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		FileReader reader = null;
		PreparedStatement pstmt = null;
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			reader = new FileReader("text.properties");
			Properties prop =new Properties();
			prop.load(reader);
			
			
			Class.forName(prop.getProperty("driver_class_name"));
			
			String url = prop.getProperty("url_static");
			conn = DriverManager.getConnection(url);
			
			String sql = prop.getProperty("update_query");
			
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
