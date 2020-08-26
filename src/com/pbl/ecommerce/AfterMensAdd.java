package com.pbl.ecommerce;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class AfterMensAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textPro_no;
	private JTextField textPro_name;
	private JTextField textPrice;
	private JTextField textStock;
	JLabel label;
	
	
	String s;
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public AfterMensAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 902, 506);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPro_no = new JTextField();
		textPro_no.setHorizontalAlignment(SwingConstants.CENTER);
		textPro_no.setText("101 <= No <= 200");
		textPro_no.setToolTipText("");
		textPro_no.setBounds(204, 61, 116, 20);
		contentPane.add(textPro_no);
		textPro_no.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PRODUCT NO :");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(135, 206, 235));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 61, 105, 20);
		contentPane.add(lblNewLabel);
		
		textPro_name = new JTextField();
		textPro_name.setHorizontalAlignment(SwingConstants.CENTER);
		textPro_name.setBounds(204, 113, 116, 20);
		contentPane.add(textPro_name);
		textPro_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCT NAME:");
		lblNewLabel_1.setForeground(new Color(135, 206, 235));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(69, 116, 116, 17);
		contentPane.add(lblNewLabel_1);
		
		textPrice = new JTextField();
		textPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textPrice.setBounds(653, 61, 116, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		textStock = new JTextField();
		textStock.setHorizontalAlignment(SwingConstants.CENTER);
		textStock.setBounds(653, 113, 116, 20);
		contentPane.add(textStock);
		textStock.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PRICE :");
		lblNewLabel_2.setForeground(new Color(135, 206, 235));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(547, 64, 96, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STOCK :");
		lblNewLabel_3.setForeground(new Color(135, 206, 235));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(547, 116, 96, 17);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ADD :");
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(666, 303, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BROWSE :");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(60, 179, 113));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(74, 302, 116, 23);
		contentPane.add(btnNewButton_1);
		
	    label = new JLabel();
	    label.setOpaque(true);
		label.setBounds(261, 231, 323, 190);
		contentPane.add(label);
		btnNewButton_1.addActionListener(new ActionListener(){
		        @Override
		     public void actionPerformed(ActionEvent e){
		         JFileChooser fileChooser = new JFileChooser();
		         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
		         fileChooser.addChoosableFileFilter(filter);
		         int result = fileChooser.showSaveDialog(null);
		         if(result == JFileChooser.APPROVE_OPTION){
		             File selectedFile = fileChooser.getSelectedFile();
		             String path = selectedFile.getAbsolutePath();
		             label.setIcon(ResizeImage(path));
		             s = path;
		           
		              }
		         else if(result == JFileChooser.CANCEL_OPTION){
		             System.out.println("No Data");
		         }
		     }

				
		    });
		btnNewButton.addActionListener(new ActionListener(){
	        
	        @Override
	        public void actionPerformed(ActionEvent e){
	            try{
	            	Connection con = null;
	            	con=DB_connection.getConnection();
	            	PreparedStatement ps = con.prepareStatement("insert into products(No, Name,  Cost, Stock, image ) values(?,?,?,?,?)");
	                InputStream is = new FileInputStream(new File(s));
	                ps.setString(1, textPro_no.getText());
	                ps.setString(2, textPro_name.getText());
	                ps.setString(3,textPrice.getText());
	                ps.setString(4,textStock.getText());
	                ps.setBlob(5,is);
	                
	                ps.executeUpdate();
	                JOptionPane.showMessageDialog(null, "Data Inserted");
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
	        }
	     });

	    
	     getContentPane().setLayout(null);
	     JLabel lblNewLabel_4 = new JLabel("IMAGE");
	     lblNewLabel_4.setForeground(new Color(135, 206, 235));
	     lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
	     lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNewLabel_4.setBounds(165, 236, 86, 20);
	     contentPane.add(lblNewLabel_4);
	     
	     }
	     
	     //Methode To Resize The ImageIcon
	     public ImageIcon ResizeImage(String imgPath){
	         ImageIcon MyImage = new ImageIcon(imgPath);
	         Image img = MyImage.getImage();
	         Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
	         ImageIcon image = new ImageIcon(newImage);
	         return image;
	     }
	}