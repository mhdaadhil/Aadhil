import java.util.Scanner;
public class Lib{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		String adminname = "mohamed022";
		String password = "Aadhil@098";
		System.out.println("1.admin\n2.user");
		int n=sc.nextInt();
		switch (n){
			case 1:
			Admin ad = new Admin();
			ad.signin(adminname,password);
			break;
			
			case 2:
			User us = new User ();
			break;
			
			default:
			System.out.println("enter the correct number");
		}
		
		
	}
}
class Admin
{
	   int a=1;
	   Scanner sc = new Scanner (System.in);
	   String arr[]=new String[50];
	
	public void signin(String adminname,String password)
	{
		 Scanner sc = new Scanner (System.in);
		System.out.println("welcome to admin signin page");
		while (a!=0)
		{
			
			System.out.println("enter the admin name ");
			String adname=sc.next();
			System.out.println("enter the password");
			String  pass=sc.next();
		
			if (adname.equals(adminname)&&pass.equals(password))
				{
					a=0;
				}
			if (a==0)
				System.out.println("signed in succesfully");
				
			else 
			System.out.println("INVALID ! username password ");
		}
	System.out.println("1.addnew\n2.view\n3.UpdateId\n4.DeleteId");
	int b=sc.nextInt();
	
	     switch(b){
			 case 1:
			 addnew ();
			 break;
			 
			 case 2:
			 view();
			 break;
			 
			 case 3:
			 updateid();
			 break;
			 
			 case 4:
			 deleteid();
			 break;
	}
		 
		 
		
	}
    	public void addnew ()
		 {
			 Scanner sc = new Scanner (System.in);
	         System.out.println("how many book ");
		     int c=sc.nextInt();
		
		
		for (int i=0;i<=c;i++)
		{
			arr[i]=sc.nextLine();
		}
		
	     }
	    public void view()
		 {
			 
		 }
		 public void updateid()
		 {
			 
		 }
		 public void deleteid()
		 {
			 
		 }	
}
	
class User{
	
	
}