package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		//interface reference variables
		//required throughout the program so it is null
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		FileReader reader = null;
		try { 
			//Step:1--> loading driver
			//java uses driver to talk with JDBC
			//driver is provided by mysql itself
			//mysql-connector-java=5.1.38 is the driver downloaded
			reader = new FileReader("text.properties");
			Properties prop =new Properties();
			prop.load(reader);
//			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver_class_name"));
			
			
			//driver manager helps to register the driver
			//driver manager is a singleton class 
			//driver manager has privateconstructor
			// driver manager class has only static methods
			
			
			
			
			//Step:2-->.Get connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//Step:3-->Issue SQL Query
			stmt = conn.createStatement();
			String sql = prop.getProperty("select_query1");
			//to execute the query this line is used
			//stmt is the type of object,it is an interface
			rs = stmt.executeQuery(sql);//return type is ResultSet;;
			//ResultSet is a table representation in java for select query execution
			
			
			
			//Step:4-->Read the result
			while(rs.next()) { //checks whether a row exists or not
				
				//String inside brackets will be the name of column
				//instead of column name column number can also be written
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");
						
						System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("----------------------");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step:5--> Close all JDBC Objects
			try {
				//to avoid null pointer exception it is checked for the null
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					conn.close();
				}
				if(rs!=null) {
					conn.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}//end of main

}
