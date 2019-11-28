package com.testyantra.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.PrintWriter is a concrete class
		//2.PrintWriter object should not be created using new keyword 
		//as we have to print it in browser we have to create using resp object
		//this is written to get a html response and it cannot interact with  browser
		
		PrintWriter out = resp.getWriter();
		//to set the type of the file
		//to get a html response
		//it will take it automatically as .html file but to change the type of file we have to write this line
		// 		resp.setContentType("text/html"); this will be used onl when giving other files
		
		
		
		System.out.println("Service method");
		System.out.println("Extra line of code");

		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");
		
		Object obj = req.getAttribute("obj");
		
	
		
		resp.setContentType("text/html");
		//
		out.println("<html>");
		out.println("<body>");
		
		//create object of date
		//when the date constructor executes it will take the present date and time
		Date date = new Date();
		out.println("<h1 style = 'color:red'>Date and time is: ");
		
		//this will generate the String representation of date
		out.println(date.toString());
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		
		String url = req.getRequestURI();
		String method = req.getMethod();
		
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		
		
		
		
		out.println("<h1>");
		out.println(obj);
		out.println("</h1>");
		
		
		
		out.println("</body>");
		out.println("</html>");
	}//end of doget
	
	
}//end of MyFirstServlet
