package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.DAO.rep_login_dao;



@WebServlet("/rep_login")
public class rep_login extends HttpServlet 

{
	private static final long serialVersionUID = 1L;
HttpSession session; 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		
	
		String rep_username=request.getParameter("rep_username");
		System.out.println(rep_username);
		
		out.println("\n");
	    
		String rep_password=request.getParameter("rep_password");
		System.out.println(rep_password);
		
		out.println("\n");
		
		
		
		
		boolean status=new rep_login_dao().login(rep_username,rep_password);

		if(status)
		{
		System.out.println("hi" +rep_username);
	   	HttpSession session=request.getSession();
		session.setAttribute("rep_username",String.valueOf(rep_username));
	    response.setContentType("text/html"); 
		ServletContext context=getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/index.jsp");  
	    rd.forward(request, response);  
	     }
		
		else{
			System.out.print("wrong credentials");
			response.setContentType("text/html"); 
			System.out.println("abcd");
			ServletContext context=getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/loginerror.html");  
		    rd.forward(request, response);  
		}
		
		}
}
		