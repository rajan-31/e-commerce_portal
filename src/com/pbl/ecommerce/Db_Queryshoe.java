package com.pbl.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.Query;


public class Db_Queryshoe {
    
   
    
    public ArrayList<Product> BindTable3(){
        
   ArrayList<Product> list = new ArrayList<Product>();
   Statement st;
   ResultSet rs;
   
   try {
	   Connection con = null;
	   try {
		con = DB_connection.getConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
   st = con.createStatement();
   rs = st.executeQuery("select * from products where No >=401 AND NO <=500");
   
   Product p;
   while(rs.next()){
   p = new Product(
   rs.getInt("No"),
   rs.getString("Name"),
   rs.getInt("Cost"),
   rs.getInt("Stock"),
   rs.getBytes("Image")
   
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(Db_Queryshoe.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }

	
}



