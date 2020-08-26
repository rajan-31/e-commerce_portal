package com.pbl.ecommerce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class AfterSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JFrame frame;
	
	public String username_mod_order;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public AfterSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 902, 506);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(397, 136, 193, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("     USERNAME         :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(242, 137, 158, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("      PASSWORD         :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(242, 199, 158, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONFIRM PASSWORD :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(219, 256, 179, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NEW USER SIGN UP ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(171, 60, 605, 43);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SIGN UP:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password,password1,username;
				username=textField.getText();
				String username_mod_cart=username+"_Cart";
				username_mod_order=username+"_Order";
				password=passwordField.getText();
				password1=passwordField_1.getText();
				if(password.equals(password1))
				{
					 
					  try {
						  Connection con = null;
						  con=DB_connection.getConnection();
						  Statement st = con.createStatement();
						  int rs=st.executeUpdate("insert into customer(username,password) values('"+username+"','"+password+"')");							  
						  if(rs==1)
						  {
						  	dispose();
						  	
						  	//st.executeUpdate("create table "+username_mod_cart+"(No int,Name varchar(88),Cost int,image blob)");
						  	
						  	//st.executeUpdate("create table "+username_mod_order+"(No int,Name varchar(88),Cost int,image blob)");
						  	
						  	
						  	
						  	
						  	JDialog dialog = new JDialog(frame,"dialog Box");

						    // setsize of dialog 
						    dialog.setSize(700, 102);
						    dialog.setLocation(360,400);
						    dialog.getContentPane().setLayout(null);
						    
						    JLabel lblPasswordMissmatched = new JLabel("SIGNUP SUCCESFULL!!!");
						    lblPasswordMissmatched.setHorizontalAlignment(SwingConstants.CENTER);
						    lblPasswordMissmatched.setFont(new Font("Tahoma", Font.ITALIC, 15));
						    lblPasswordMissmatched.setBounds(219, 10, 254, 19);
						    dialog.getContentPane().add(lblPasswordMissmatched);
						    
						    JButton btnOk = new JButton("OK");
						    btnOk.setBackground(UIManager.getColor("Button.light"));
						    btnOk.addActionListener(new ActionListener() {
						    	public void actionPerformed(ActionEvent e) {
						    		dialog.dispose();
						    	}
						    });
						    btnOk.setBackground(UIManager.getColor("Button.light"));
						    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
						    btnOk.setBounds(297, 34, 85, 21);
						    dialog.getContentPane().add(btnOk);

						    // set visibility of dialog 
						    dialog.setVisible(true);
						  	
						  }
						  
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				}else {
					JDialog dialog = new JDialog(frame,"dialog Box");

				    // setsize of dialog 
				    dialog.setSize(700, 102);
				    dialog.setLocation(360,400);
				    dialog.getContentPane().setLayout(null);
				    
				    JLabel lblPasswordMissmatched = new JLabel("PASSWORD MISSMATCHED");
				    lblPasswordMissmatched.setHorizontalAlignment(SwingConstants.CENTER);
				    lblPasswordMissmatched.setFont(new Font("Tahoma", Font.ITALIC, 15));
				    lblPasswordMissmatched.setBounds(219, 10, 254, 19);
				    dialog.getContentPane().add(lblPasswordMissmatched);
				    
				    JButton btnOk = new JButton("OK");
				    btnOk.setBackground(UIManager.getColor("Button.light"));
				    btnOk.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		dialog.dispose();
				    	}
				    });
				    btnOk.setBackground(UIManager.getColor("Button.light"));
				    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
				    btnOk.setBounds(297, 34, 85, 21);
				    dialog.getContentPane().add(btnOk);

				    // set visibility of dialog 
				    dialog.setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(353, 348, 134, 28);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(397, 198, 193, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(397, 255, 193, 20);
		contentPane.add(passwordField_1);
	}
}
