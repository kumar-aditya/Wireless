package com.customerlog;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class check_form_json
 */
@WebServlet("/check_form_json")
public class check_form_json extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		String plan=request.getParameter("plan");
	   out.println(plan);
	   String ordertype=request.getParameter("ordertype");
	   out.println(ordertype);
	   String firstname=request.getParameter("firstname");
	   out.println(firstname);
	   String lastname=request.getParameter("lastname");
	   out.println(lastname);
	   String streetname=request.getParameter("streetname");
	   out.println(streetname);
	   String city=request.getParameter("city");
	   out.println(city);
	   String country=request.getParameter("country");
	   out.println(country);
	   String email=request.getParameter("email");
	   out.println(email);
	   
	   
	}

	

}
