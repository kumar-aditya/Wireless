package com.customerlog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CustomerLogReason")
public class CustomerLogReason extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CustomerLogReason() {
        super();
    }
    
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			//System.out.println("inside get of servlet 2");
			
			HttpSession session=request.getSession();  
			String m=(String)session.getAttribute("mail");
			
			
			boolean status=new CustomerDao().CustLog3(m);

			if(status)
			{	
				System.out.println("Updated");
				response.sendRedirect("plans.jsp");
			}
			else
				System.out.println("not updated");
			
			

		
			
		} catch (Exception e) {
		e.printStackTrace();
	}

		
	}

	
	
}
