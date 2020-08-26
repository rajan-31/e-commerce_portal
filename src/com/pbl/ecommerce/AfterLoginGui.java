package com.pbl.ecommerce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;


public class AfterLoginGui extends JFrame {
	private JTable table;
	private JTable table1;
	private JTextField txtHgvhv;
	private JFrame frame;
	public int c_id;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AfterLoginGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 902, 540);
		getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(210, 80, 676, 423);
		getContentPane().add(layeredPane);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(0, 11, 676, 412);
		layeredPane.add(panel11);
		panel11.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setToolTipText("Click To View");
		Image img3=new ImageIcon(this.getClass().getResource("/mens.png")).getImage();
		btnNewButton_4.setIcon(new ImageIcon(img3));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MensWear mens_wear=new MensWear();
				mens_wear.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mens_wear.setVisible(true);
				
			}
		});
		btnNewButton_4.setBounds(75, 41, 120, 121);
		panel11.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setToolTipText("Click To View");
		Image img4=new ImageIcon(this.getClass().getResource("/wom.png")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(img4));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WomensWear womens_wear=new WomensWear();
				womens_wear.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				womens_wear.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(262, 41, 127, 121);
		panel11.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setToolTipText("Click To View");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Watches watches=new Watches();
				watches.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				watches.setVisible(true);
			}
		});
		Image img5=new ImageIcon(this.getClass().getResource("/wat.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(img5));
		btnNewButton_6.setBounds(463, 41, 127, 121);
		panel11.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Click To View");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shoes shoes=new Shoes();
				shoes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				shoes.setVisible(true);
			}
		});
		Image img6=new ImageIcon(this.getClass().getResource("/shoe.png")).getImage();
		btnNewButton_7.setIcon(new ImageIcon(img6));
		btnNewButton_7.setBounds(138, 216, 134, 121);
		panel11.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setToolTipText("Click To View");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Goggles eye=new Goggles();
				eye.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				eye.setVisible(true);
			}
		});
		Image img7=new ImageIcon(this.getClass().getResource("/gog.png")).getImage();
		btnNewButton_8.setIcon(new ImageIcon(img7));
		btnNewButton_8.setBounds(378, 216, 127, 121);
		panel11.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("MEN'S WEAR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(75, 173, 120, 14);
		panel11.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WOMEN'S WEAR");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(262, 173, 127, 14);
		panel11.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WATCHES");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(463, 172, 127, 14);
		panel11.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("SHOES");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(138, 348, 134, 14);
		panel11.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("EYE WEAR");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(365, 348, 127, 14);
		panel11.add(lblNewLabel_7);
		
		JLabel lblSelectItemTo = new JLabel("SELECT ITEM TO VIEW");
		lblSelectItemTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectItemTo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSelectItemTo.setBounds(0, 0, 676, 30);
		panel11.add(lblSelectItemTo);
		
		JPanel panel12 = new JPanel();
		panel12.setBounds(0, 11, 676, 412);
		layeredPane.add(panel12);
		panel12.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 676, 409);
		panel12.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		Db_QueryAfterDisplay mq112 = new Db_QueryAfterDisplay();
        ArrayList<ProductOrder> list1=mq112.BindTable466();  
        String[] columnName12 = {"No","Name","Price","image"};
        Object[][] rows12 = new Object[list1.size()][5];
        for(int i = 0; i < list1.size(); i++){
            rows12[i][0] = list1.get(i).getID();
            rows12[i][1] = list1.get(i).getName();
            rows12[i][2] = list1.get(i).getPrice();
            if(list1.get(i).getMyImage() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list1.get(i).getMyImage()).getImage()
             .getScaledInstance(150, 150, Image.SCALE_SMOOTH) );   
                
            rows12[i][3] = image;
            }
            else{
                rows12[i][3] = null;
            }
            
        }
        
        ModelOrder model1 = new ModelOrder(rows12, columnName12);
        table.setModel(model1);
        table.setRowHeight(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);

		
		
		JPanel panel13 = new JPanel();
		panel13.setBounds(0, 11, 676, 412);
		layeredPane.add(panel13);
		panel13.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(0, 0, 676, 362);
		panel13.add(scrollPane1);
		
		JButton btnNewButton_9 = new JButton("EMPTY CART");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		    		
		    		JDialog dialog1 = new JDialog(frame,"");

				    // setsize of dialog 
				    dialog1.setSize(700, 102);
				    dialog1.setLocation(360,400);
				    dialog1.getContentPane().setLayout(null);
				    
				    JLabel lblPasswordMissmatched = new JLabel("CART IS EMPTY");
				    lblPasswordMissmatched.setHorizontalAlignment(SwingConstants.CENTER);
				    lblPasswordMissmatched.setFont(new Font("Tahoma", Font.ITALIC, 15));
				    lblPasswordMissmatched.setBounds(219, 10, 254, 19);
				    dialog1.getContentPane().add(lblPasswordMissmatched);
				    
				    JButton btnOk = new JButton("OK");
				    btnOk.setBackground(UIManager.getColor("Button.light"));
				    btnOk.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    	
				    		dispose();
				    		dialog1.dispose();
				    		
				    		AfterLoginGui afterlogin=new AfterLoginGui();
							afterlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							afterlogin.setVisible(true);
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
				  c_id=l1.getModUsername();

	            	PreparedStatement ps = con.prepareStatement("delete from carts where c_id="+c_id);
	            	ps.executeUpdate();

				  						
			} catch (Exception ex) 
			  {
				System.out.println(ex.toString());
			  }
	            
			}
		});
		btnNewButton_9.setBounds(101, 372, 155, 30);
		panel13.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("PROCEED TO BUY");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					  Connection con = null;
					  con = DB_connection.getConnection(); 
					  Statement st = con.createStatement();
					  
					  Login l1=new Login();					  
					  c_id=l1.getModUsername();
					  
			            	ResultSet rs=st.executeQuery("select No from carts where c_id="+c_id);
			            	while(rs.next())
			            	{
			            		int No=rs.getInt(1);	
			            	PreparedStatement ps = con.prepareStatement("insert into orders(c_id,No) values(?,?)");

						  ps.setInt(1, c_id);
						  ps.setInt(2,No);
						   
						  ps.executeUpdate(); 
						  break; 
						  } 
			               
			            	PreparedStatement ps1 = con.prepareStatement("delete from carts where c_id="+c_id);
			            	ps1.executeUpdate(); 				
				} catch (Exception ex) 
				  {
					System.out.println(ex.toString());
				  }
				AfterProceedBuy afterProceedBuy=new AfterProceedBuy();
		    	afterProceedBuy.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    	afterProceedBuy.setVisible(true);
		    	afterProceedBuy.setBounds(200, 200, 902, 540);
				
			}
		});
		btnNewButton_10.setBounds(407, 372, 155, 30);
		panel13.add(btnNewButton_10);
		
		table1 = new JTable();
		scrollPane1.setViewportView(table1);
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		Db_QueryAfterDisplayCart mq11211 = new Db_QueryAfterDisplayCart();
        ArrayList<ProductOrder> list11=mq11211.BindTable4666();
        String[] columnName1 = {"No","Name","Price","image"};
        Object[][] rows1 = new Object[list11.size()][5];
        for(int i = 0; i < list11.size(); i++){
            rows1[i][0] = list11.get(i).getID();
            rows1[i][1] = list11.get(i).getName();
            rows1[i][2] = list11.get(i).getPrice();
            if(list11.get(i).getMyImage() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list11.get(i).getMyImage()).getImage()
             .getScaledInstance(150, 150, Image.SCALE_SMOOTH) );   
                
            rows1[i][3] = image;
            }
            else{
                rows1[i][3] = null;
            }
            
        }
        
        ModelOrder model11 = new ModelOrder(rows1, columnName1);
        table1.setModel(model11);
        table1.setRowHeight(150);
        table1.getColumnModel().getColumn(3).setPreferredWidth(150);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 80, 209, 423);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("DISPLAY ITEMS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel11);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBorderPainted(false);

		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(9, 127, 189, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("YOUR ORDERS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel12);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setBounds(9, 174, 189, 47);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CART");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2.setBorderPainted(false);
		

		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel13);
				layeredPane.repaint();
				layeredPane.revalidate();
				//Cart cart=new Cart();
				//cart.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				//cart.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(9, 219, 189, 47);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login=new Login();
				login.initialize1();
			}
		});
		btnNewButton_3.setBorderPainted(false);

		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setBounds(9, 268, 189, 47);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("MENU");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_4.setBounds(9, 72, 189, 42);
		panel.add(lblNewLabel_4);
		
		JLabel lblYourId = new JLabel("USER ID : ");
		lblYourId.setBounds(20, 9, 110, 42);
		panel.add(lblYourId);
		lblYourId.setForeground(SystemColor.inactiveCaptionText);
		lblYourId.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourId.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		
		Login l2 = new Login();
		String x = Integer.toString(l2.cust_id);
				
		txtHgvhv = new JTextField();
		txtHgvhv.setBackground(Color.GRAY);
		txtHgvhv.setBounds(129, 10, 56, 39);
		panel.add(txtHgvhv);
		txtHgvhv.setText(x);
		txtHgvhv.setForeground(new Color(0, 255, 255));
		txtHgvhv.setHorizontalAlignment(SwingConstants.CENTER);
		txtHgvhv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHgvhv.setEditable(false);
		txtHgvhv.setColumns(10);
		
		JButton button = new JButton("");
		button.setBounds(79, 336, 50, 50);
		panel.add(button);
		button.setToolTipText("REFRESH");
		Image img20=new ImageIcon(this.getClass().getResource("/refresh9.png")).getImage();
		button.setIcon(new ImageIcon(img20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AfterLoginGui afterlogin=new AfterLoginGui();
				afterlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				afterlogin.setVisible(true);
			}
		});
		button.setBackground(UIManager.getColor("Button.light"));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 0, 886, 89);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		Image img10=new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		

		Login l3 = new Login();
		JLabel lblNewLabel_5 = new JLabel("WELCOME " +l3.user_name);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_5.setBounds(269, 24, 555, 42);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(39, 10, 123, 67);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(img10));
		
		
	}
}
