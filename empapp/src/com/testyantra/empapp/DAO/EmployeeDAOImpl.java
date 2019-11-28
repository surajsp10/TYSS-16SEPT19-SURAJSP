
package com.testyantra.empapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.testyantra.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	
	public List<EmployeeBean> getAllEmployeeData() {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee";
		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =  null;
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<EmployeeBean> result =  new ArrayList<EmployeeBean>();
			
			while(rs.next()) {
//				System.out.println("ID : "+rs.getInt("id"));
//				System.out.println("Name : "+rs.getString("name"));
//				System.out.println("Salary : "+rs.getInt("salary"));
//				System.out.println("Gender : "+rs.getInt("gender"));
				EmployeeBean bean =  new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				
				String name = rs.getString("name");
				bean.setName(name);
				
				int sal = rs.getInt("salary");
				bean.setSal(sal);
				
				
				String gender = rs.getString("gender");
				bean.setGender(gender);
				
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
	
		
	}//end of searchEmployee data

	
	
	public EmployeeBean SearchEmployee(int id){
		
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root?password=root";
		String sql ="select * from employee where id=?";
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
				
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					conn = DriverManager.getConnection(url);
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1,id);
					rs = pstmt.executeQuery();
					
					
					if(rs.next()) {
						EmployeeBean bean = new EmployeeBean();
						bean.setId(rs.getInt("id"));
						bean.setName(rs.getString("name"));
						bean.setSal(rs.getInt("salary"));
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



	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int deleteEmployeeData(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
}//end of class
