package com.testyantra.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String search = req.getParameter("search");
		
		String value = req.getParameter("select");
		if(value.equals("Google"))
			resp.sendRedirect("https://www.google.com/search?q="+search);
		else if(value.equals("Bing"))
			resp.sendRedirect("https://www.bing.com/search?q="+search);
		else 
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+search);
		
	}//end of doget
}//end of RedirectServlet
