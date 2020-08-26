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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class AfterAdminLoginGui extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AfterAdminLoginGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 902, 540);
		getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(210, 80, 676, 388);
		getContentPane().add(layeredPane);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(0, 11, 676, 377);
		layeredPane.add(panel11);
		panel11.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setToolTipText("Click To View");
		Image img3=new ImageIcon(this.getClass().getResource("/mens.png")).getImage();
		btnNewButton_4.setIcon(new ImageIcon(img3));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfterMensAdd aftermensadd=new AfterMensAdd();
				aftermensadd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				aftermensadd.setVisible(true);
				
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
				AfterWomensAdd afterwomensadd=new AfterWomensAdd();
				afterwomensadd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				afterwomensadd.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(264, 41, 127, 121);
		panel11.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setToolTipText("Click To View");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfterWatchesAdd afterwatchesadd=new AfterWatchesAdd();
				afterwatchesadd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				afterwatchesadd.setVisible(true);
			}
		});
		Image img5=new ImageIcon(this.getClass().getResource("/wat.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(img5));
		btnNewButton_6.setBounds(441, 41, 127, 121);
		panel11.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Click To View");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfterShoeAdd aftershoeadd=new AfterShoeAdd();
				aftershoeadd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				aftershoeadd.setVisible(true);
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
				AfterGogglesAdd aftergoggleadd=new AfterGogglesAdd();
				aftergoggleadd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				aftergoggleadd.setVisible(true);
			}
		});
		Image img7=new ImageIcon(this.getClass().getResource("/gog.png")).getImage();
		btnNewButton_8.setIcon(new ImageIcon(img7));
		btnNewButton_8.setBounds(365, 216, 127, 121);
		panel11.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("MEN'S WEAR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(75, 173, 120, 14);
		panel11.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WOMEN'S WEAR");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(264, 173, 137, 14);
		panel11.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WATCHES");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(441, 173, 127, 14);
		panel11.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("SHOES");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(138, 348, 134, 14);
		panel11.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("GOGGLES");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(365, 348, 127, 14);
		panel11.add(lblNewLabel_7);
		
		JLabel lblNewLabel_81 = new JLabel("SELECT ITEM TO ADD");
		lblNewLabel_81.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_81.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_81.setBounds(0, 0, 666, 30);
		panel11.add(lblNewLabel_81);
		
		JPanel panel12 = new JPanel();
		panel12.setBounds(0, 11, 676, 377);
		layeredPane.add(panel12);
		panel12.setLayout(null);
		
		JButton btnNewButton_41 = new JButton("");
		Image img31=new ImageIcon(this.getClass().getResource("/mens.png")).getImage();
		btnNewButton_41.setIcon(new ImageIcon(img31));
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MensWearDelete mens_wear=new MensWearDelete();
				mens_wear.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mens_wear.setVisible(true);
			}
		});
		btnNewButton_41.setBounds(75, 41, 120, 121);
		panel12.add(btnNewButton_41);
	
		
		JButton btnNewButton_51 = new JButton("");
		Image img41=new ImageIcon(this.getClass().getResource("/wom.png")).getImage();
		btnNewButton_51.setIcon(new ImageIcon(img41));
		btnNewButton_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WomensWearDelete womens_wear=new WomensWearDelete();
				womens_wear.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				womens_wear.setVisible(true);
			}
		});
		btnNewButton_51.setBounds(264, 41, 127, 121);
		panel12.add(btnNewButton_51);
		
		JButton btnNewButton_61 = new JButton("");
		btnNewButton_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WatchesDelete watches=new WatchesDelete();
				watches.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				watches.setVisible(true);
			}
		});
		Image img51=new ImageIcon(this.getClass().getResource("/wat.png")).getImage();
		btnNewButton_61.setIcon(new ImageIcon(img51));
		btnNewButton_61.setBounds(441, 41, 127, 121);
		panel12.add(btnNewButton_61);
		
		JButton btnNewButton_71= new JButton("");
		btnNewButton_71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ShoesDelete shoes=new ShoesDelete();
				shoes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				shoes.setVisible(true);
			}
		});
		Image img61=new ImageIcon(this.getClass().getResource("/shoe.png")).getImage();
		btnNewButton_71.setIcon(new ImageIcon(img61));
		btnNewButton_71.setBounds(138, 216, 134, 121);
		panel12.add(btnNewButton_71);
		
		JButton btnNewButton_81 = new JButton("");
		btnNewButton_81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GogglesDelete eye=new GogglesDelete();
				eye.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				eye.setVisible(true);
			}
		});
		Image img71=new ImageIcon(this.getClass().getResource("/gog.png")).getImage();
		btnNewButton_81.setIcon(new ImageIcon(img71));
		btnNewButton_81.setBounds(365, 216, 127, 121);
		panel12.add(btnNewButton_81);
		
		JLabel lblNewLabel_8 = new JLabel("SELECT ITEM TO DELETE");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(0, 0, 666, 30);
		panel12.add(lblNewLabel_8);
		
		JLabel lblNewLabel1 = new JLabel("MEN'S WEAR");
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel1.setBounds(75, 173, 120, 14);
		panel12.add(lblNewLabel1);
		
		JLabel lblNewLabel_11 = new JLabel("WOMEN'S WEAR");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_11.setBounds(264, 173, 137, 14);
		panel12.add(lblNewLabel_11);
		
		JLabel lblNewLabel_21 = new JLabel("WATCHES");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_21.setBounds(441, 173, 127, 14);
		panel12.add(lblNewLabel_21);
		
		JLabel lblNewLabel_61 = new JLabel("SHOES");
		lblNewLabel_61.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_61.setBounds(138, 348, 134, 14);
		panel12.add(lblNewLabel_61);
		
		JLabel lblNewLabel_71 = new JLabel("GOGGLES");
		lblNewLabel_71.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_71.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_71.setBounds(365, 348, 127, 14);
		panel12.add(lblNewLabel_71);
		
		JPanel panel13 = new JPanel();
		panel13.setBounds(0, 11, 676, 377);
		layeredPane.add(panel13);
		panel13.setLayout(null);
		
		JButton btnNewButton_411 = new JButton("");
		Image img311=new ImageIcon(this.getClass().getResource("/mens.png")).getImage();
		btnNewButton_411.setIcon(new ImageIcon(img311));
		btnNewButton_411.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MensWearDisplay mens_wear=new MensWearDisplay();
				mens_wear.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mens_wear.setVisible(true);
			}
		});
		btnNewButton_411.setBounds(75, 41, 120, 121);
		panel13.add(btnNewButton_411);
	
		
		JButton btnNewButton_511 = new JButton("");
		Image img411=new ImageIcon(this.getClass().getResource("/wom.png")).getImage();
		btnNewButton_511.setIcon(new ImageIcon(img411));
		btnNewButton_511.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WomensWearDisplay womens_wear=new WomensWearDisplay();
				womens_wear.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				womens_wear.setVisible(true);
			}
		});
		btnNewButton_511.setBounds(264, 41, 127, 121);
		panel13.add(btnNewButton_511);
		
		JButton btnNewButton_611 = new JButton("");
		btnNewButton_611.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WatchesDisplay watches=new WatchesDisplay();
				watches.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				watches.setVisible(true);
			}
		});
		Image img511=new ImageIcon(this.getClass().getResource("/wat.png")).getImage();
		btnNewButton_611.setIcon(new ImageIcon(img511));
		btnNewButton_611.setBounds(441, 41, 127, 121);
		panel13.add(btnNewButton_611);
		
		JButton btnNewButton_711= new JButton("");
		btnNewButton_711.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShoesDisplay shoes=new ShoesDisplay();
				shoes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				shoes.setVisible(true);
			}
		});
		Image img611=new ImageIcon(this.getClass().getResource("/shoe.png")).getImage();
		btnNewButton_711.setIcon(new ImageIcon(img611));
		btnNewButton_711.setBounds(138, 216, 134, 121);
		panel13.add(btnNewButton_711);
		
		JButton btnNewButton_811 = new JButton("");
		btnNewButton_811.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GogglesDisplay eye=new GogglesDisplay();
				eye.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				eye.setVisible(true);
			}
		});
		Image img711=new ImageIcon(this.getClass().getResource("/gog.png")).getImage();
		btnNewButton_811.setIcon(new ImageIcon(img711));
		btnNewButton_811.setBounds(365, 216, 127, 121);
		panel13.add(btnNewButton_811);
		
		JLabel lblNewLabel_811 = new JLabel("SELECT ITEM TO DISPLAY");
		lblNewLabel_811.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_811.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_811.setBounds(0, 0, 666, 30);
		panel13.add(lblNewLabel_811);
		
		JLabel lblNewLabel11 = new JLabel("MEN'S WEAR");
		lblNewLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel11.setBounds(75, 173, 120, 14);
		panel13.add(lblNewLabel11);
		
		JLabel lblNewLabel_111 = new JLabel("WOMEN'S WEAR");
		lblNewLabel_111.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_111.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_111.setBounds(264, 173, 137, 14);
		panel13.add(lblNewLabel_111);
		
		JLabel lblNewLabel_211 = new JLabel("WATCHES");
		lblNewLabel_211.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_211.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_211.setBounds(441, 173, 127, 14);
		panel13.add(lblNewLabel_211);
		
		JLabel lblNewLabel_611 = new JLabel("SHOES");
		lblNewLabel_611.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_611.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_611.setBounds(138, 348, 134, 14);
		panel13.add(lblNewLabel_611);
		
		JLabel lblNewLabel_711 = new JLabel("GOGGLES");
		lblNewLabel_711.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_711.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_711.setBounds(365, 348, 127, 14);
		panel13.add(lblNewLabel_711);
		
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(0, 11, 676, 377);
		layeredPane.add(panel_14);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 80, 209, 423);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD STOCK");
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
		btnNewButton.setBounds(10, 123, 189, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE ITEMS");
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
		btnNewButton_1.setBounds(10, 170, 189, 47);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DISPLAY ITEMS");
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
			}
		});
		btnNewButton_2.setBounds(10, 215, 189, 47);
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
		btnNewButton_3.setBounds(10, 264, 189, 47);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("MENU");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_4.setBounds(10, 74, 189, 42);
		panel.add(lblNewLabel_4);
		
		JLabel lblAdminId = new JLabel("ADMIN ID : ");
		lblAdminId.setBounds(22, 10, 110, 42);
		panel.add(lblAdminId);
		lblAdminId.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminId.setForeground(Color.BLACK);
		lblAdminId.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		
		Login l3 = new Login();
		String admin_id= Integer.toString(l3.admin_id);
		
		textField = new JTextField();
		textField.setBounds(131, 11, 56, 39);
		panel.add(textField);
		textField.setText(admin_id);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(0, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.GRAY);
		
		JButton button = new JButton("");
		button.setBounds(79, 321, 50, 50);
		panel.add(button);
		
		Image img20=new ImageIcon(this.getClass().getResource("/refresh9.png")).getImage();
		button.setIcon(new ImageIcon(img20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AfterAdminLoginGui afteradminlogin=new AfterAdminLoginGui();
				afteradminlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				afteradminlogin.setVisible(true);
			}
		});
		
		button.setToolTipText("REFRESH");
		button.setBackground(UIManager.getColor("Button.light"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 0, 886, 89);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img101=new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img101));
		lblNewLabel_3.setBounds(43, 11, 123, 67);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("WELCOME "+l3.user_name);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_5.setBounds(258, 25, 561, 42);
		panel_1.add(lblNewLabel_5);
		
		
	}
}
