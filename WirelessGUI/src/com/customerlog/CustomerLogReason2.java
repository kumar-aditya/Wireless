package com.customerlog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CustomerLogReason2")
public class CustomerLogReason2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CustomerLogReason2() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			System.out.println("inside get of servlet 2");
			
			HttpSession session=request.getSession();  
			String m=(String)session.getAttribute("mail");
			
			boolean status=new CustomerDao().CustLog2(m);

			if(status)
				{
				System.out.println("Updated");
				response.sendRedirect("order_status.jsp");
				}
			
			else
				System.out.println("not updated");
			
			

		
			
		} catch (Exception e) {
		e.printStackTrace();
	}

		
	}

	
}
