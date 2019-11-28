package com.tyss.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCSVFile {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee values(?,?,?,?)";
		try(FileReader in  = new FileReader("csv.txt");
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			
			
			BufferedReader reader =new BufferedReader(in);
			while(reader.ready()) {
				String line = reader.readLine();
				String[] data = line.split(",");
				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int salary = Integer.parseInt(data[2]);
				String gender = data[3];
				
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, salary);
				pstmt.setString(4, gender);
				
//				
//				int count = pstmt.executeUpdate();
//				System.out.println(count + " Rows inserted ");
				pstmt.addBatch();
				
				
			}
			int[] counts = pstmt.executeBatch();
			System.out.println(counts.length+" Rows inserted");
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}//end of try catch
	}//
}
