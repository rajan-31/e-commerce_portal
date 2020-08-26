package com.pbl.ecommerce;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AfterProceedBuy extends JFrame{
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public AfterProceedBuy() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("FILL PERSONAL INFORMATION");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 51, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 32));
		label.setBounds(131, 22, 566, 35);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Enter Full Name : ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(194, 97, 145, 26);
		getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(372, 100, 285, 26);
		getContentPane().add(textField);
		
		JLabel label_2 = new JLabel("Enter Mobile NO. : ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(188, 133, 151, 35);
		getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(372, 140, 285, 26);
		getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("Enter PinCode :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(208, 179, 131, 35);
		getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(372, 186, 285, 26);
		getContentPane().add(textField_2);
		
		JLabel label_4 = new JLabel("Enter City/Town :");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(194, 226, 145, 26);
		getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(372, 229, 285, 26);
		getContentPane().add(textField_3);
		
		JLabel label_5 = new JLabel("Enter Address :");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(208, 268, 131, 26);
		getContentPane().add(label_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(372, 271, 285, 103);
		getContentPane().add(textArea);
		
		JButton button = new JButton("PROCEED");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JDialog dialog = new JDialog(frame,"");

			    // setsize of dialog 
			    dialog.setSize(700, 102);
			    dialog.setLocation(360,400);
			    dialog.getContentPane().setLayout(null);
			    
			    JLabel lblPasswordMissmatched = new JLabel("PURCHASE SUCCESSFUL");
			    lblPasswordMissmatched.setHorizontalAlignment(SwingConstants.CENTER);
			    lblPasswordMissmatched.setFont(new Font("Tahoma", Font.ITALIC, 15));
			    lblPasswordMissmatched.setBounds(219, 10, 254, 19);
			    dialog.getContentPane().add(lblPasswordMissmatched);
			    
			    JButton btnOk = new JButton("OK");
			    btnOk.setBackground(UIManager.getColor("Button.light"));
			    btnOk.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    	
			    		dispose();
			    		dispose();
			    		dispose();
			    		dispose();
			    		AfterLoginGui afterlogin=new AfterLoginGui();
						afterlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						afterlogin.setVisible(true);
			    		dialog.dispose();
			    	}
			    });
			    btnOk.setForeground(Color.RED);
			    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
			    btnOk.setBounds(297, 34, 85, 21);
			    dialog.getContentPane().add(btnOk);

			    // set visibility of dialog 
			    dialog.setVisible(true);
			   
			    
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(UIManager.getColor("Button.light"));
		button.setBounds(359, 417, 165, 40);
		getContentPane().add(button);
		// TODO Auto-generated constructor stub
	}
}
