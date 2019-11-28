package com.testyantra.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dto.EmployeeInfo;
import com.testyantra.empwebapp.util.EmployeeDaoManager;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email  = req.getParameter("email");
		String password  = req.getParameter("password");
		
		EmployeeInfo info = new EmployeeInfo();
		info.setId(id);
		info.setEmail(email);
		info.setName(name);
		info.setPassword(password);
		
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
	//	dao.registerEmployee(info);
		boolean check = dao.registerEmployee(info);
		
		PrintWriter out = resp.getWriter();
		String msg="";
		if(check) {
			msg="Registration Completed";
		
//			out.println("<html>");
//			out.println("<h4>Registration Completed</h4>");
//			out.println("</html>");
//			out.println("<html>");
//			out.println("<h4>Id cannot be repeated</h4>");
//			out.println("</html>");
		}else {
			msg="Id cannot be repeated";
			
			
			
//			out.println("<html>");
//			out.println("<h4>Id cannot be repeated</h4>");
//			out.println("</html>");
			
			
			
//			out.println("<html>");
//			out.println("<h4>Registration Completed</h4>");
//			out.println("</html>");
		}
		
		req.setAttribute("msg", msg);
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
		dispatcher.include(req, resp);
;	}//end of dopost

}//end of RegisterServlet
