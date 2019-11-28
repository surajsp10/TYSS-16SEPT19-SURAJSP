package com.testyantra.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.dto.EmployeeInfo;
@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		HttpSession session = req.getSession(false);
		
		if(session!=null) {
			
			//copied to jsp
			EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
			
		//	PrintWriter out = resp.getWriter();
//			out.println("<html>");
//			out.println("<body>");
//			out.println("<h1>Welcome"+info.getName());
//			out.println("</h1>");
//			
//			out.println("<a href='./search.html'>Search</a>");
//			out.println("<a href='./changepassword.html'>Change Password</a>");
//			out.println("<a href='./logout'>Logout</a>");
//			out.println("</body>");
//			out.println("</html>");
			
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req, resp);
			
			
		}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
		
		
	}//end of doget
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
}//end of HomeServlet
