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


public class Db_QueryAfterDisplay {
    
   
    public ArrayList<ProductOrder> BindTable466(){
        
   ArrayList<ProductOrder> list1 = new ArrayList<ProductOrder>();
   Statement st;
   ResultSet rs;
   Login pa=new Login();
  // String z=pa.z1;
   
   try {
	   Connection con = null;
	   try {
		con = DB_connection.getConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
   st = con.createStatement();
   Login l1=new Login();
  int c_id=l1.getModUsername();
   
   //String a1=l1.getModUsername()+"_Order";
   //rs = st.executeQuery("select *from "+a1);
   
   
	  
   rs = st.executeQuery("select products.No,products.Name,products.Cost,products.image from products INNER Join orders ON orders.No = products.No AND c_id ="+c_id);
   
   ProductOrder p;
   while(rs.next()){
   p = new ProductOrder(
   rs.getInt("No"),
   rs.getString("Name"),
   rs.getInt("Cost"),
   rs.getBytes("image")
   
   );
   list1.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(Db_QueryAfterDisplay.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list1;
   }

	
}

