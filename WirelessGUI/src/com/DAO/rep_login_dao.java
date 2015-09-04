package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.customerlog.ConnectionClass;

public class rep_login_dao {
	Connection conn= new ConnectionClass().getConnection();
public boolean login(String rep_username,String rep_password)
{	
	boolean status=false;
	
	try {
		PreparedStatement ps=conn.prepareStatement("select * from WL_REP_LOGIN_DB where USERNAME=? and PASSWORD=?");
		System.out.println("ps statement working");
		ps.setString(1, rep_username);
		ps.setString(2, rep_password);

		ResultSet rs=ps.executeQuery();
		
		System.out.println("ps executed");
		status=rs.next();
		
		System.out.println(status);
		
		
	} catch (SQLException e)
	{
		
		e.printStackTrace();
	}

	if(status)
	 return true;
	else
		return false;
	
	
			
}
	
}

