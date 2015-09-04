package com.customerlog;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class checkplan
 */
@WebServlet("/checkplan")
public class checkplan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rep_username="Dharu";
		HttpSession session=request.getSession();
		//String email=session.getAttribute("mail");
		session.setAttribute("rep_username",String.valueOf(rep_username));
		
		String order_name = request.getParameter("order_name");
		String plan_type = request.getParameter("plan_type");
		System.out.println(order_name);
		String cust_type="new";
		
		response.setContentType("text/html"); 
		 ServletContext context=getServletContext();
		 request.setAttribute("plan"," plan_type");
		 request.setAttribute("order_type","order_name");
		 
		 
		 if(cust_type=="new")
		 {
			
			 request.setAttribute("cust_id","null");
			 request.setAttribute("cust_type","new");
			 
		 }
		 else
		 {   
			 request.setAttribute("cust_id","4567");
			 request.setAttribute("cust_type","registered");
			 request.setAttribute("firstname","sindu");
			 request.setAttribute("lastname","balaji");
			 request.setAttribute("streetname","Alex Avenue");
			 request.setAttribute("zipcode","23456");
			 request.setAttribute("city","Los Angeles");
			 request.setAttribute("state","California");
			 
			 
			 
			 request.setAttribute("email","sindu@gmail.com");
			 request.setAttribute("contact_number","9380268880");
			 request.setAttribute("dob","1993-08-15");
			 
				 
		 }
		 RequestDispatcher rd=context.getRequestDispatcher("/cust_reg_form.jsp");  
	        rd.forward(request, response); 
		
		
	}

}
