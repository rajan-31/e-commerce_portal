package com.pbl.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_connection 
{
	public static Connection getConnection() 
			  throws Exception
			  {
				  Class.forName("com.mysql.jdbc.Driver");
				  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E_Com","rajan","123456");
				  //Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E_Com?useSSL=false","rajan","123456");
				
				
				return con; 
			  }

}
