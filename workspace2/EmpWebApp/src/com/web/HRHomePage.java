package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HRHomePage")
public class HRHomePage extends HttpServlet {
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String emaiId = request.getParameter("emailId");
		
		out.println("<body bgcolor='lightyellow' text='green'>");
		out.println("<h3 style='color:Red;'> Welcome "+emaiId+"!</h3>");
		
		//For Logout
		out.print("<form align='right'>");
		out.print("<a href='Logout'>Logout</>");
		out.print("<form>");
		
		out.println("<center>");
		out.println("<h1>Welcome to HRHomePage</h1>");
		out.println("<h3>");
		out.println("<a href=''>getAllEmp</a> &nbsp; &nbsp");
		out.println("<a href=''>getEmpById</a>");
		out.println("</h3>");
		out.println("</center>");
		out.println("</body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

