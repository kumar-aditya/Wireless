package com.customerlog;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnectionClass {

		Connection conn;

		public Connection getConnection()
		 {
					try {
						
							InitialContext initialContext = new InitialContext();
							Context context = (Context) initialContext.lookup("java:comp/env");
							DataSource ds=(DataSource)context.lookup("connpool");
							conn = ds.getConnection();
							System.out.println("connecteddb");
						

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NamingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("connection done");
				return conn;
			}
	}


