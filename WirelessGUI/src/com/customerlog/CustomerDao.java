package com.customerlog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.customerlog.ConnectionClass;

public class CustomerDao {
	
Connection conn= new ConnectionClass().getConnection();
	
	public boolean CustLog(String email,String location)
	{
		System.out.println("a");
		boolean status=false;
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into WL_CUSTLOG(EMAILID, LOCATION) values(?,?)");
			

			ps.setString(1,email);
			ps.setString(2,location);

			ResultSet rs=ps.executeQuery();
			
			
			status=rs.next();
			System.out.println(status);
			
			
		} catch (Exception e)
		{
			
			e.printStackTrace();
		}

		if(status)
		 return true;
		else
			return false;
		
		
	}
	
	
	public boolean CustLog2(String email)
	{	System.out.println("Inside custlog2");
		boolean status=false;
		try {
			PreparedStatement ps=conn.prepareStatement("update WL_CUSTLOG set REASON=? where EMAILID=?");			

			ps.setString(1,"ORDER ENQUIRY");
			ps.setString(2,email);
			System.out.println("in ps");
			ResultSet rs=ps.executeQuery();
			
			System.out.println("after execute");
			status=rs.next();
			System.out.println(status);
			
			
		} catch (Exception e)
		{
			
			e.printStackTrace();
		}

		if(status)
		 return true;
		else
			return false;
		
		
	}
	
	
	
	
	public boolean CustLog3(String email)
	{
		boolean status=false;
		try {
			PreparedStatement ps=conn.prepareStatement("update WL_CUSTLOG set REASON=? where EMAILID=?");			

			ps.setString(1,"PLAN ENQUIRY");
			ps.setString(2,email);

			ResultSet rs=ps.executeQuery();
			
			
			status=rs.next();
			System.out.println(status);
			
			
		} catch (Exception e)
		{
			
			e.printStackTrace();
		}

		if(status)
		 return true;
		else
			return false;
		
		
	}
	
	
	

}
