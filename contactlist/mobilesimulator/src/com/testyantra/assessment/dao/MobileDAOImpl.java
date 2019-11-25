package com.testyantra.assessment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.testyantra.assessment.dto.ContactBean;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public ContactBean selectContact(String name) {



		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root?password=root";
		String sql ="select * from employee where name=?";
		Connection conn = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;



		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();


			if(rs.next()) {
				ContactBean bean = new ContactBean();
				bean.setNumber(rs.getInt("number"));
				bean.setGroupp(rs.getString("groupp"));
				bean.setName(rs.getString("name"));



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

	@Override
	public ContactBean insertContact(String number,String name,String groupp) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into contact_list values(?,?,?)";


		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =  null;
		PreparedStatement pstmt = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2,name);
			pstmt.setString(3,groupp);
			int number1  = Integer.parseInt("number");
			pstmt.setInt(1,number1);
			rs = pstmt.executeQuery();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}


	@Override
	public int updateContact() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ContactBean> getAllContacts(String name) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from contact_list";


		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =  null;



		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<ContactBean> result =  new ArrayList<ContactBean>();

			while(rs.next()) {
				//				System.out.println("ID : "+rs.getInt("id"));
				//				System.out.println("Name : "+rs.getString("name"));
				//				System.out.println("Salary : "+rs.getInt("salary"));
				//				System.out.println("Gender : "+rs.getInt("gender"));
				ContactBean bean =  new ContactBean();

				int number = rs.getInt("number");
				bean.setNumber(number);

				String name1 = rs.getString("name");
				bean.setName(name1);;


				String groupp = rs.getString("groupp");
				bean.setGroupp(groupp);;

				result.add(bean);


			}
			return result;
		} catch (Exception e) {



			e.printStackTrace();
			return null;
			// TODO: handle exception
		}finally {

			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();

				if(rs!=null)
					rs.close();
			}catch(Exception e){
				e.printStackTrace();

			}
		}
		//	return null;
	}

	@Override
	public ContactBean searchContact(String name) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root?password=root";
		String sql ="select * from employee where name=?";
		Connection conn = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;



		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();


			if(rs.next()) {
				ContactBean bean = new ContactBean();
				bean.setNumber(rs.getInt("number"));
				bean.setGroupp(rs.getString("groupp"));
				bean.setName(rs.getString("name"));



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

	@Override
	public int deleteContact() {
		
		return 0;
	}

}
