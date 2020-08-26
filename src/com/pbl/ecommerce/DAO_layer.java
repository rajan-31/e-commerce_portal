package com.pbl.ecommerce;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pbl.ecommerce.Java_bean;
import com.pbl.ecommerce.DB_connection;

public class DAO_layer {

	public int DAO_userlogin(Java_bean value) {
		
		 try
		  {
			  Connection con = null;
			  int result;	
			  con=DB_connection.getConnection(); 
			  Statement st = con.createStatement();
			  ResultSet rs=st.executeQuery("select * from customer where username='"+value.getUsername()+"' and password='"+value.getPassword()+"'");
			  if(rs.next())
			  {
			  	result=rs.getInt(1);
			  }
			  else
			  {
				result=0;
			  }
			  con.close();
			  return result; 
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
	}
		
		  public int DAO_adminlogin(Java_bean value)
			{
				  try
				  {
					  Connection con = null;
					  int result;
					  con=DB_connection.getConnection(); 
					  Statement st = con.createStatement();
					  ResultSet rs=st.executeQuery("select * from admin where admin_name='"+value.getUsername()+"' and password='"+value.getPassword()+"'");
					  if(rs.next())
					  {
					  	result=rs.getInt(1);
					  }
					  else
					  {
						result=0;
					  }
					  con.close();
					  return result; 
				  }
				  catch(Exception ex)
				  {
					  System.out.println(ex.toString());
					  return 0;
				  }	
			}
		
				  public int DAO_userregister(Java_bean value)
					{
						  try
						  {
							  Connection con = null;
							  con=DB_connection.getConnection(); 
							  int result;
							  Statement st = con.createStatement();
							  int rs=st.executeUpdate("insert into customer(username,password) values('"+value.getUsername()+"','"+value.getPassword()+"')");							  
							  if(rs==1)
							  {
							  	result=1;
							  }
							  else
							  {
								result=0;
							  }
							  con.close();
							  return result; 
						  }
						  catch(Exception ex)
						  {
							  System.out.println(ex.toString());
							  return 0;
						  }	
					}
		
				  public void dao_displayall()
				  {
					  try {
						  Connection con = null;
						   con=DB_connection.getConnection(); 
						  Statement st = con.createStatement();
						  ResultSet rs=st.executeQuery("select * from mens_wear");
						 while(rs.next())
						  {
						  	int m_id=rs.getInt(1);
						  	String name=rs.getString(2);
						  	int price=rs.getInt(3);
						  	int stock=rs.getInt(4);
						  	System.out.println(m_id+" "+name+" "+price+" "+stock);
						  	
						  }
						  						
					} catch (Exception ex) 
					  {
						System.out.println(ex.toString());
					  }
					  
				  }
				
					public int dao_addtocart(int c_id,int m_id)
					{
						try {
							 Connection con = null;
							  con=DB_connection.getConnection(); 
							  int result;
							  Statement st = con.createStatement();
							  int rs=st.executeUpdate("insert into buys(c_id,m_id) values('"+c_id+"','"+m_id+"')");	
							  
							  if(rs==1)
							  {
							  	result=1;
							  }
							  else
							  {
								result=0;
							  }
							  con.close();
							  return result; 
							
						} catch (Exception ex)
						{
							System.out.println(ex.toString());
							return 0;
						}
					}
					
					public int dao_addtostock(String s_name,int s_price,int s_stock)
					{
						try {
							 Connection con = null;
							  con=DB_connection.getConnection(); 
							  int result;
							  Statement st = con.createStatement();
							  int rs=st.executeUpdate("insert into mens_wear(m_name,price,stock) values('"+s_name+"','"+s_price+"','"+s_stock+"')");							  
							  if(rs==1)
							  {
							  	result=1;
							  }
							  else
							  {
								result=0;
							  }
							  con.close();
							  return result; 
							
						} catch (Exception ex)
						{
							System.out.println(ex.toString());
							return 0;
						}
					}
					
					public void dao_displaystock()
					  {
						  try {
							  Connection con = null;
							   con=DB_connection.getConnection(); 
							  Statement st = con.createStatement();
							  ResultSet rs=st.executeQuery("select * from mens_wear");
							 while(rs.next())
							  {
							  	int m_id=rs.getInt(1);
							  	String name=rs.getString(2);
							  	int price=rs.getInt(3);
							  	int stock=rs.getInt(4);
							  	System.out.println(m_id+" "+name+" "+price+" "+stock);
							  	
							  }
							  						
						} catch (Exception ex) 
						  {
							System.out.println(ex.toString());
						  }
						  
					  }
					
					public int dao_removestock(int m_id,int r_stock)
					{
						try {
							Connection con = null;
							  con=DB_connection.getConnection(); 
							  Statement st = con.createStatement();
							  int rs=st.executeUpdate("delete from mens_wear where(m_id,stock)=('"+m_id+"','"+r_stock+"')");
							 int result;
							
							  if(rs==1)
							  {
							  	result=1;
							  }
							  else
							  {
								result=0;
							  }
							  con.close();
							  return result; 
							
							
							 
						} catch (Exception ex)
						{
							System.out.println(ex.toString());
							return 0;
						}
					}
					
					
					public void dao_displaycart(int c_id)
					{
						try {
							  Connection con = null;
							  con=DB_connection.getConnection(); 
							  Statement st = con.createStatement();
							  ResultSet rs=st.executeQuery("select * from buys natural join mens_wear where c_id='"+c_id+"'");
							  while(rs.next())
							  {
							  	int m_id=rs.getInt(1);
							  	String name=rs.getString(3);
							  	int price=rs.getInt(4);
							  	int stock=rs.getInt(5);
							  	System.out.println(m_id+" "+name+" "+price+" "+stock);
							  	
							  }
						} catch (Exception ex)
						{
							System.out.println(ex.toString());
						}	
					}
					
					public int dao_deletefromcart(int m_id)
					{
						try
						{
							Connection con = null;
							  con=DB_connection.getConnection(); 
							  Statement st = con.createStatement();
							  int rs=st.executeUpdate("delete from buys where m_id='"+m_id+"'");
							  return rs;
							 
						} catch (Exception ex)
						{
							System.out.println(ex.toString());
							return 0;
						}
					}	
					
	}


