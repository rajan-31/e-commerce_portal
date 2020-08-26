package com.pbl.ecommerce;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window;
public class Login {

	private JFrame frame;
	private JTextField txtEnterUsername;
	private JPasswordField passwordField;
	public  String username;
	public  String password;
	public String username_cart;
	public static int z;
	public static int cust_id,admin_id;
	public static String user_name;


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public int getModUsername() {
		int z1=this.z;
		return z;
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize1();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void initialize1() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Showcard Gothic", Font.ITALIC, 11));
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBounds(200, 200, 902, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/new-11.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(-32, 28, 562, 440);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO FASHION STORE");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Algerian", Font.ITALIC, 28));
		lblNewLabel_1.setBounds(341, 55, 460, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setBounds(717, 125, 125, 20);
		frame.getContentPane().add(txtEnterUsername);
		txtEnterUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(717, 223, 125, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("   USERNAME");
		Image img1=new ImageIcon(this.getClass().getResource("/LOGIN.jpg")).getImage();
		lblUsername.setIcon(new ImageIcon(img1));
		lblUsername.setFont(new Font("Vladimir Script", Font.PLAIN, 11));
		lblUsername.setBounds(604, 100, 88, 73);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(614, 184, 75, 78);
		Image img2=new ImageIcon(this.getClass().getResource("/pass.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("USER LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service_login_layer s1= new Service_login_layer();
				user_name=txtEnterUsername.getText();
				String pass=passwordField.getText();
				
				username=user_name;
				password=pass;
				int result = s1.service_userlogin(user_name,pass);
				
				z=result;
				
				cust_id=result;
				//setting value for feedback to sevice layer
			    if (result!=0) {
			    	
					AfterLoginGui afterlogin=new AfterLoginGui();
					afterlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					afterlogin.setVisible(true);
					
				}
				else {
					JDialog dialog = new JDialog(frame,"");

				    // setsize of dialog 
				    dialog.setSize(700, 102);
				    dialog.setLocation(360,400);
				    dialog.getContentPane().setLayout(null);
				    
				    JLabel lblPasswordMissmatched = new JLabel("INVALID USERNAME OR PASSWORD");
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
				    btnOk.setForeground(Color.RED);
				    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
				    btnOk.setBounds(297, 34, 85, 21);
				    dialog.getContentPane().add(btnOk);

				    // set visibility of dialog 
				    dialog.setVisible(true);
				}
			
			
			}
			
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton.setBounds(662, 289, 139, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADMIN LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service_login_layer s1= new Service_login_layer();
				
				user_name=txtEnterUsername.getText();
				String pass=passwordField.getText();
				
				username=user_name;
				password=pass;
				
				int result = s1.service_adminlogin(user_name,pass);
				admin_id=result;
				
				//setting value for feedback to sevice layer
				if (result!=0) {
					//AfterAdminLoginGui afteradminlogin=new AfterAdminLoginGui();
					AfterAdminLoginGui afteradminlogin=new AfterAdminLoginGui();
					afteradminlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					afteradminlogin.setVisible(true);
					
					
					
					
				}
				else {
					JDialog dialog = new JDialog(frame,"");

				    // setsize of dialog 
				    dialog.setSize(700, 102);
				    dialog.setLocation(360,400);
				    dialog.getContentPane().setLayout(null);
				    
				    JLabel lblPasswordMissmatched = new JLabel("INVALID USERNAME OR PASSWORD");
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
				    btnOk.setForeground(Color.RED);
				    btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
				    btnOk.setBounds(297, 34, 85, 21);
				    dialog.getContentPane().add(btnOk);

				    // set visibility of dialog 
				    dialog.setVisible(true);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(662, 345, 139, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SIGN UP");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AfterSignUpGui signup=new AfterSignUpGui();
				AfterSignUp aftersignup=new AfterSignUp();
				aftersignup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				aftersignup.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_2.setForeground(new Color(60, 179, 113));
		btnNewButton_2.setBounds(465, 407, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("    NEW USER...SIGN UP ??");
		lblNewLabel_3.setForeground(new Color(30, 144, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3.setBounds(435, 365, 146, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblUsername_1 = new JLabel("    USERNAME:");
		lblUsername_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblUsername_1.setBounds(702, 100, 140, 14);
		frame.getContentPane().add(lblUsername_1);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblPassword.setBounds(717, 199, 84, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel errorlable = new JLabel("");
		errorlable.setBounds(717, 148, 159, 14);
		frame.getContentPane().add(errorlable);
		
		JLabel errorlabel2 = new JLabel("");
		errorlabel2.setBounds(717, 248, 159, 14);
		frame.getContentPane().add(errorlabel2);
		
	}

	
}
