package com.customerlog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customerlog.CustomerDao;


@WebServlet("/CustomerLogEmail")
public class CustomerLogEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerLogEmail() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			System.out.println("Inside post");
			String mail=request.getParameter("mail");
			System.out.println(mail);
			String location=request.getParameter("location");
			
			PrintWriter out= response.getWriter();
			if (mail== null) 
		    {
//
//				response.sendRedirect("index.jsp");
//		        out.println("<html><body onload=\"alert('GIVE MAIL PROPERLY')\"></body></html>");
				   out.println("<script type=\"text/javascript\">");
				   out.println("alert('User or password incorrect');");
				   out.println("location='index.jsp';");
				   out.println("</script>");
		    }
			
			else if (mail.indexOf("@", 0) < 0)
		    {
		        response.sendRedirect("index.jsp");
		        out.println("<html><body onload=\"alert('GIVE MAIL PROPERLY')\"></body></html>");


		    }
			else if (mail.indexOf(".", 0) < 0)
		    {
		        response.sendRedirect("index.jsp");
		        out.println("<html><body onload=\"alert('GIVE MAIL PROPERLY')\"></body></html>");

		    }
			else if(location.equalsIgnoreCase("select")){
		        response.sendRedirect("index.jsp");
		        out.println("<html><body onload=\"alert('GIVE LOCATION')\"></body></html>");

		    }
		    else{
			
			HttpSession session=request.getSession();  
        	session.setAttribute("mail",mail);
        	session.setAttribute("location", location);
	

    		boolean status=new CustomerDao().CustLog(mail,location);

			if(status)
			{	System.out.println("Updated");
				response.sendRedirect("order_type.jsp");
				System.out.println("abc");
			}
			else
				System.out.println("not updated");
		    }
		} catch (Exception e) {
		e.printStackTrace();
	}

}
	

}
