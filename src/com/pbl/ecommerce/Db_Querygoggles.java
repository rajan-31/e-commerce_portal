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


public class Db_Querygoggles {
    
   
    
    public ArrayList<Product> BindTable4(){
        
   ArrayList<Product> list = new ArrayList<Product>();
   //Connection con = getConnection();
   
   
   Statement st;
   ResultSet rs;
   
   try {
	   Connection con = null;
	   con = DB_connection.getConnection();
   st = con.createStatement();
   rs = st.executeQuery("select *from products where No >=501 AND NO <=600");
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
   
   
   } catch (Exception e) {
	e.printStackTrace();
}
   return list;
   }

	
}


