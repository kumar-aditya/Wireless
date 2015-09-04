package com.DAO.ssn;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	

	import com.customerlog.ConnectionClass;

	public class new_cust_ssn_dao {
		Connection conn= new ConnectionClass().getConnection();
		
	public boolean login(int ssn)
	{	
		boolean status=false;
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("select * from WL_CREDIT_CHECK where ssn=?" );
			ps.setInt(1,ssn);
			

			ResultSet rs=ps.executeQuery();
			
			
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


