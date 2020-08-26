package com.pbl.ecommerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.sql.rowset.serial.*;



public class MensWear extends javax.swing.JFrame {
    static String No1;
    public int c_id,No2;

    public MensWear() {
        initComponents();
        populateJTable();
    }

  // create a methode to populate data Into JTable from Mysql  database And Displaying Picture
    
    public void populateJTable(){
        Db_Querymens mq1 = new Db_Querymens();
        ArrayList<Product> list=mq1.BindTable1();
        String[] columnName = {"No","Name","Cost","Stock","image"};
        Object[][] rows = new Object[list.size()][5];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getID();
            rows[i][1] = list.get(i).getName();
            rows[i][2] = list.get(i).getPrice();
            rows[i][3] = list.get(i).getStock();
            if(list.get(i).getMyImage() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
             .getScaledInstance(150, 150, Image.SCALE_SMOOTH) );   
                
            rows[i][4] = image;
            }
            else{
                rows[i][4] = null;
            }
            
        }
        
         model = new ModelTable(rows, columnName);
        jTable1.setModel(model);
        jTable1.setRowHeight(150);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,902,540);
        

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4","Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            	  int selectedRowIndex= jTable1.getSelectedRow();
            	  No1=(model.getValueAt(selectedRowIndex,0) .toString());
	              No2 = Integer.parseInt(No1);
            	  
              	JDialog dialog = new JDialog(frame,"");

  			    // setsize of dialog 
              	dialog.setSize(600, 150);
  			    dialog.setLocation(360,400);
  			    dialog.getContentPane().setLayout(null);
  			    
  			    JLabel lblPasswordMissmatched = new JLabel("SELECT AN OPTION");
  			    lblPasswordMissmatched.setHorizontalAlignment(SwingConstants.CENTER);
  			    lblPasswordMissmatched.setFont(new Font("Tahoma", Font.ITALIC, 15));
  			    lblPasswordMissmatched.setBounds(185, 10, 200, 21);
  			    dialog.getContentPane().add(lblPasswordMissmatched);
  			    
  			    JButton btnOk = new JButton("PROCEED TO BUY");
  			    btnOk.setBackground(UIManager.getColor("Button.light"));
  			    btnOk.addActionListener(new ActionListener() {
  			    	public void actionPerformed(ActionEvent e) {
  			    		try {
    						  Connection con = null;
    						  con = DB_connection.getConnection(); 
    						  Statement st = con.createStatement();
    						  
    						  Login l1=new Login();
    						  //String a2=l1.getModUsername()+"_Order";
    						  
    						  
    						  //int rs=st.executeUpdate("insert into "+a2+" select No,Name,Cost,image from mens_wear where No="+No1);
    						  c_id=l1.getModUsername();
    						  try{
    				            	/*ResultSet rs=st.executeQuery("select  from mens_wear where No="+No1);
    				            	while(rs.next())
    				            	{
    				            		int No=rs.getInt(1);
    				    			  	String name=rs.getString(2);
    				    			  	int cost=rs.getInt(3);
    				    			  	int stock=rs.getInt(4);	
    				    			  	Blob image = new SerialBlob(rs.getBytes(5));*/
    				            		
    				            	//PreparedStatement ps = con.prepareStatement("insert into orders(c_id,No, Name,  Cost, image ) values(?,?,?,?,?)");
    				            	PreparedStatement ps = con.prepareStatement("insert into orders(c_id,No) values(?,?)");

    				            	
								
								  ps.setInt(1, c_id);
								   ps.setInt(2,No2);
								   // ps.setString(3, name);
								 //ps.setInt(4,cost); 
								  //ps.setInt(5,stock);
								 //  ps.setBlob(5,image);
								  ps.executeUpdate(); 
								  //break; 
								  //}
								 
    				               
    				            }catch(Exception ex){
    				                ex.printStackTrace();
    				            }
    						  
    						  ResultSet rs2=st.executeQuery("select stock from products where No="+No1);
    						while(rs2.next())
    					  {
    					  	int stock=rs2.getInt(1);
    					  	stock=stock-1;
    					  	int rs3=st.executeUpdate("update products set stock="+stock+" where No="+No1);
    					  	break;
    					  }
    						 
    						  						
    					} catch (Exception ex) 
    					  {
    						System.out.println(ex.toString());
    					  }
  			    		dialog.dispose();
  			    		
  			    		AfterProceedBuy afterProceedBuy=new AfterProceedBuy();
  			    		afterProceedBuy.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  			    		afterProceedBuy.setVisible(true);
  			    		afterProceedBuy.setBounds(200, 200, 902, 540);
  			    		dispose();
  			    	}
  			    });
  			    btnOk.setForeground(Color.RED);
  			    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
  			    btnOk.setBounds(62, 63, 200, 21);
  			    dialog.getContentPane().add(btnOk);
  			    

  			    JButton btncart = new JButton("ADD TO CART");
  			    btncart.setBackground(UIManager.getColor("Button.light"));
  			    btncart.addActionListener(new ActionListener() {
  			    	public void actionPerformed(ActionEvent e) {
  			    		
  			    		JDialog dialog1 = new JDialog(frame,"");

  					    // setsize of dialog 
  					    dialog1.setSize(700, 102);
  					    dialog1.setLocation(360,400);
  					    dialog1.getContentPane().setLayout(null);
  					    
  					    JLabel lblPasswordMissmatched = new JLabel("ADDED TO CART SUCCESSFULLY");
  					    lblPasswordMissmatched.setHorizontalAlignment(SwingConstants.CENTER);
  					    lblPasswordMissmatched.setFont(new Font("Tahoma", Font.ITALIC, 15));
  					    lblPasswordMissmatched.setBounds(219, 10, 254, 19);
  					    dialog1.getContentPane().add(lblPasswordMissmatched);
  					    
  					    JButton btnOk = new JButton("OK");
  					    btnOk.setBackground(UIManager.getColor("Button.light"));
  					    btnOk.addActionListener(new ActionListener() {
  					    	public void actionPerformed(ActionEvent e) {
  					    
  					    		dialog1.dispose();
  					    		
  					    	}
  					    });
  					    btnOk.setForeground(Color.RED);
  					    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
  					    btnOk.setBounds(297, 34, 85, 21);
  					    dialog1.getContentPane().add(btnOk);

  					    // set visibility of dialog 
  					    dialog1.setVisible(true);
  					    
  		                   
  		                
  		               
  		               
  		              try {
						  Connection con = null;
						   con=DB_connection.getConnection(); 
						  Statement st = con.createStatement();
						  
						  Login l1=new Login();
						  
						  //String a1=l1.getModUsername()+"_Cart";
						  //int rs=st.executeUpdate("insert into "+c_id+" select No,Name,Cost,image from mens_wear where No="+No1);
						  c_id=l1.getModUsername();
						  /*ResultSet rs=st.executeQuery("select * from mens_wear where No="+No1);
			            	while(rs.next())
			            	{
			            		int No=rs.getInt(1);
			    			  	String name=rs.getString(2);
			    			  	int cost=rs.getInt(3);
			    			  	int stock=rs.getInt(4);	
			    			  	Blob image = new SerialBlob(rs.getBytes(5));
			            		
			            	PreparedStatement ps = con.prepareStatement("insert into carts(c_id,No, Name,  Cost, image ) values(?,?,?,?,?)");
			                */

			            	PreparedStatement ps = con.prepareStatement("insert into carts(c_id,No) values(?,?)");
			            	ps.setInt(1,c_id);
			                ps.setInt(2,No2);
			                ps.executeUpdate();

			            	
			                /*ps.setString(3, name);
			                ps.setInt(4,cost);
			                //ps.setInt(5,stock);
			                ps.setBlob(5,image);
			                
			                break;
			            	}
						 	*/
						  						
					} catch (Exception ex) 
					  {
						System.out.println(ex.toString());
					  }
  		               
  			    		dialog.dispose();
  			    	}
  			    });
  			    btncart.setForeground(Color.RED);
  			    btncart.setFont(new Font("Tahoma", Font.BOLD, 16));
  			    btncart.setBounds(304, 63, 200, 21);
  			    dialog.getContentPane().add(btncart);

  			    // set visibility of dialog 
  			    dialog.setVisible(true);
  			    
  			    
              }
        });
        jScrollPane1.setViewportView(jTable1);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

       
    }// </editor-fold>                                                            

  
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
 private JFrame frame;
    
    
     ModelTable model;
   
   
    // End of variables declaration   
   
}