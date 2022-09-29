import java.util.Scanner;
public class Lib{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		String adminname = "mohamed022";
		String password = "Aadhil@098";
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
class Admin{
	   int a=1;
	    
	public void signin(String adminname,String password){
		 Scanner sc = new Scanner (System.in);
		System.out.println("welcome to admin signin page");
		while (a!=0){
			
		System.out.println("enter the admin name ");
		String adname=sc.next();
		System.out.println("enter the password");
		String  pass=sc.next();
		
		if (adname.equals(adminname)&&pass.equals(password))
		{
			a=0;
		}
		else 
			System.out.println("INVALID ! username password ");
	}
	if (a==0)
		System.out.println("signed in succesfully");
	
		
	}
	
	
}
class User{
	
	
}