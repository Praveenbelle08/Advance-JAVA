
 package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentHomePage")
public class StudentHomePage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String emailId = request.getParameter("emailId");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Home Page</title>");
        out.println("</head>");
        out.println("<body bgcolor='lightyellow' text='green'>");

        out.println("<h3>Welcome " + emailId + "!</h3>");

        // Navigation links or actions for the StudentHomePage
        out.println("<ul>");
        out.println("<li><a href='course'>View Courses</a></li>");
        out.println("<li><a href='ViewProfile'>View Profile</a></li>");
        // Add more links or actions specific to student functionality
        out.println("</ul>");

        // Logout link
        out.println("<form action='Logout' method='GET'>");
        out.println("<input type='submit' value='Logout'>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
