package com.testyantra.assesment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.testyantra.assesment.dto.ContactInfo;

public class ContactImpl implements ContactDAO {

	
	
	
	
	
	@Override
	public int insertContact(ContactInfo info) {
		
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "insert into contact values(?,?,?)";		

		Connection conn = null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, info.getName());
			pstmt.setInt(2, info.getNumber());
			pstmt.setString(3,info.getGroupp());
			
			int i=pstmt.executeUpdate();
			return i;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	
	}

	@Override
	public int updateContact(ContactInfo info) {
		
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "update contact set  number=?,group=? where name=? ";		

		Connection conn = null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, info.getName());
			pstmt.setInt(2, info.getNumber());
			pstmt.setString(3,info.getGroupp());
			
			int i=pstmt.executeUpdate();
			return i;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	
	}

	@Override
	public int deleteContact(String name) {
		
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "delete from contact where name=? ";		

		Connection conn = null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
		
			int i=pstmt.executeUpdate();
			return i;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public List<ContactInfo> getAllContacts() {

		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "select * from contact";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		
			conn = DriverManager.getConnection(url);

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<ContactInfo> result = new ArrayList<ContactInfo>();
			while (rs.next()) {

				ContactInfo info=new ContactInfo();
			
				String name = rs.getString("name");
				info.setName(name);
				int number = rs.getInt("number");
				info.setNumber(number);
				String group = rs.getString("groupp");
				info.setGroupp(group);

				result.add(info);
		}
			return result;
			}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}//end getall method

	@Override
	public ContactInfo searchContact(String name) {

		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&&password=root";
		String sql = "select * from contact where name=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

//			
			if (rs.next()) {

				ContactInfo info = new ContactInfo();
				
				info.setName(rs.getString("name"));
				info.setNumber(rs.getInt("number"));
				info.setGroupp(rs.getString("groupp"));

				return info;

			} else {
				return null;
			}
//			
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} // end of finally block
		
	}

}//end of class
