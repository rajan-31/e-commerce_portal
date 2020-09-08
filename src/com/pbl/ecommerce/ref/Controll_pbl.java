package com.pbl.ecommerce;
import java.util.Scanner;

public class Controll_pbl {
	Scanner sc  = new Scanner(System.in);
	Service_login_layer s1= new Service_login_layer();	
	
	
	public int userlogin()
	{
		System.out.println("ENTER USERNAME ");
		String user_name = sc.nextLine();
		System.out.println("ENTER PASSWORD ");
		String pass = sc.nextLine();
		int result = s1.service_userlogin(user_name,pass);
		return result;
	}
	
	public int adminlogin()
	{
		System.out.println("ENTER USERNAME \n");
		String user_name = sc.nextLine();
		System.out.println("ENTER PASSWORD \n");
		String pass = sc.nextLine();
		int result = s1.service_adminlogin(user_name,pass);
		return result;
	}
	
	public int userregister()
	{
		System.out.println("ENTER USERNAME \n");
		String username=sc.nextLine();
		System.out.println("ENTER PASSWORD \n");
		String password=sc.nextLine();
		int result=s1.service_useregister(username,password);
		return result;
	}
	
	public void displayall()
	{
		s1.service_displayall();
	}
	
	public int addtocart(int c_id)
	{
		System.out.println("ENTER PRODUCT ID \n");
		int m_id=sc.nextInt();
		int result=s1.service_addtocart(c_id,m_id);
		return result;
	}
	
		public void displaycart(int c_id)
		{
			s1.service_displaycart(c_id);
	}
	
	public void deletefromcart()
	{
		System.out.println("ENTER PRODUCT ID \n");
		int m_id=sc.nextInt();
		s1.service_deletefromcart(m_id);
	}
	
	
	public int addtostock()
	{
		System.out.println("ENTER PRODUCT NAME AND PRICE \n");
		String s_name=sc.nextLine();
		int s_price=sc.nextInt();
		int s_stock=sc.nextInt();
		int result=s1.service_addtostock(s_name,s_price,s_stock);
		return result;
		
	}
	
	public void displaystock()
	{
		s1.service_displaystock();
	}
	
	public int removestock()
	{
		System.out.println("ENTER STOCK_ID NO> TO DELETE\n");
		int m_id=sc.nextInt();
		int r_stock=sc.nextInt();
		int result=s1.service_removestock(m_id,r_stock);
		return result;
	}
	public static void main(String[] args) {
		do {
			int result,result1,result2;
			Controll_pbl c1 = new Controll_pbl();
			Scanner obj  = new Scanner(System.in);			
			System.out.println("Select 1...4 :\n 1:USER LOGIN\n 2:ADMIN LOGIN \n 3:SIGN_UP \n 4:EXIT");
			int choice = obj.nextInt();
			if(choice==4)
			{
				System.out.println("THANK YOU!!!!!");
				break;
			}
			switch (choice) {
			case 1:
				result=c1.userlogin();
				if(result!=0)
				{
					System.out.println("LOGIN SUCCESS!!!!!");
					do {
						System.out.println("press \n1:DISPLAY ALL MENS WEAR \n2:ADD TO CART \n3:DISPLAY MYCART \n4:REMOVE FROM CART \n5:LOGOUT");
						int choice1 = obj.nextInt();
						if (choice1==5) {
							break;
						}
						switch (choice1) {
						case 1:
							c1.displayall();						
							break;
						case 2:
							result1=c1.addtocart(result);
							if(result1==1)
							{
								System.out.println("ADEED TO CART SUCCESSFULLY");
							}
							break;
						case 3:
							c1.displaycart(result);
							break;
						case 4:
							c1.deletefromcart();
							break;
							}
					} while (true);
				}
				break;
			case 2:
				result=c1.adminlogin();
				if(result==1)
				{
					System.out.println("|||||||LOGIN SUCCESSFUL||||||");
				
					do {
						System.out.println("press \n1.ADD STOCK \n2.REMOVE STOCK \n3.DISPLAY STOCK \n4.LOGOUT");
						int choice2 = obj.nextInt();
						if(choice2==4){
							break;
						}
						switch(choice2){
						case 1:
							result2=c1.addtostock();
							if(result2==1)
							{
								System.out.println("ADDED TO CART");
							}
							break;
						case 2:
							c1.displaystock();
							result2=c1.removestock();
							if(result2==1)
							{
								System.out.println("REMOVED!!!!!!!!!!");
							}
							break;
						case 3:
							c1.displaystock();
							break;
						}
						
					}while(true);
				}
				break;
			case 3:
				result=c1.userregister();
				if(result==1)
				{
					System.out.println("SIGNUP SUCCESSFULL");
				}
				break;
			}
		} while (true);
		
	} 
}