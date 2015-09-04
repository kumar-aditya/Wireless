package com.login.ssn;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.ssn.new_cust_ssn_dao;


/**
 * Servlet implementation class DbCreate
 */

@WebServlet("/new_cust_ssn")
public class new_cust_ssn extends HttpServlet 

{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
HttpSession session; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		
		String firstname=request.getParameter("firstname");
		System.out.println(firstname);
		request.setAttribute("firstname", firstname);
		
		String lastname=request.getParameter("lastname");
		System.out.println(lastname);
		request.setAttribute("lastname", lastname);
		
		String streetname=request.getParameter("streetname");
		System.out.println(streetname);
		request.setAttribute("streetname", streetname);
		
		int zipcode=Integer.parseInt(request.getParameter("zipcode"));
		System.out.println(zipcode);
		request.setAttribute("zipcode", zipcode);
		
		String city=request.getParameter("city");
		System.out.println(city);
		request.setAttribute("city", city);
		
		String state=request.getParameter("state");
		System.out.println(state);
		request.setAttribute("state", state);
		
		String country=request.getParameter("country");
		System.out.println(country);
		request.setAttribute("country", country);
		  
		String email=request.getParameter("email");
		System.out.println(email);
		request.setAttribute("email", email);
		 
		String dob=request.getParameter("dob");
		System.out.println(dob);
		request.setAttribute("dob", dob);
		
		int ssn=Integer.parseInt(request.getParameter("ssn"));
		System.out.println(ssn);
		request.setAttribute("ssn", ssn);
		
		String order_type=request.getParameter("order_type");
		System.out.println(order_type);
		request.setAttribute("order_type",order_type);
		  
		
		String plan=request.getParameter("plan");
		System.out.println(plan);
		request.setAttribute("plan", plan);
		
		String contact_number=request.getParameter("contact_number");
		System.out.println(contact_number);
		request.setAttribute("contact_number", contact_number);
		
		String cust_id=request.getParameter("cust_id");
		System.out.println(cust_id);
		request.setAttribute("cust_id", cust_id);
		
		String cust_type=request.getParameter("cust_type");
		System.out.println(cust_type);
		request.setAttribute("cust_type", cust_type);
		
		Connection conn=null;
		boolean status=new new_cust_ssn_dao().login(ssn);
		System.out.println(status);

		if(status)
		{
		System.out.println("hi" +ssn);
	    ServletContext context=getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/order_confirmation_page.jsp");  
	    rd.forward(request, response);  
	     }
		
		else{
			System.out.print("wrong credentials");
			response.setContentType("text/html"); 
			ServletContext context=getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/order_type.jsp");  
		    rd.forward(request, response);  
		}
	}
	
}
