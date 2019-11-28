package com.testyantra.employeeapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.employeeapp.dao.EmployeeDAOimpl;
import com.testyantra.employeeapp.dto.beanobject.EmployeeBeans;

public class Search extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String search = req.getParameter("search");
		
		int id1 = Integer.parseInt(search);
		EmployeeDAOimpl s = new EmployeeDAOimpl();
		EmployeeBeans a = s.SearchEmployee(id1);
		
		PrintWriter out = resp.getWriter();
		
		
		
		out.println("<html>");
		out.println("<body>");
		
		if(a==null) {
			out.println("<h1>Sorry we could not find the given employee</h1>");
		}else {
			out.println("<table>");
			out.println("<tr>");
			out.println("<h1>Id :"+a.getId()+"</h1>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<h1>Name :"+a.getName()+"</h1>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<h1>Salary :"+a.getSalary()+"</h1>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<h1>Gender :"+a.getGender()+"</h1>");
			out.println("</tr>");
			out.println("<table>");
		}
		
		out.println("</body>");
		out.println("</html>");
	
		
		
		
	}

	
}
