import java.util.Scanner;
public class Lib{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		String adminname = "mo";
		String password = "Aa";
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
	    int c;
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
		choose();
	
		 
		 
		
	}
    	public void addnew()
		 {
			 Scanner sc = new Scanner (System.in);
	         System.out.println("how many book ");
		     c=sc.nextInt()+2;
		
		for (int i=2;i<=c;i++)
		{
			arr[i]=sc.nextLine();
		}
		choose();
		
	     }
	    public void view()
		 {
			 arr[1]="Sutish the warrior";
	         arr[2]="anas the legend";
			
			for(int i=1;i<=c;i++)
			 {
				 System.out.println(i+"."+arr[i]);
			 }
			 choose();
			 
		 }
		 public void updateid()
		 {
			 for (int i=1;i<=c;i++)
			 System.out.println(i+" "+arr[i]);
			 
		    System.out.println("*******************************enter the position that you want to update******************************");
			int pos=sc.nextInt();
			String book =sc.nextLine();
			System.out.println("enter the book name ");
			book =sc.nextLine();
			
			barr[pos]=book;
			//for (int i=1;i<=c;i++)
			//System.out.println(arr[i]);
            System.out.println(".........................SUCCESSFULLY UPDATED.................................");			
			choose();
		}
		 public void deleteid()
		 {
			 
		 }	
		 public void choose(){
			 System.out.println("1.view 2.addnew 3.updateid  4.deleteid");
		     int d=sc.nextInt();
		  switch(d){
			case 1:
			view();
			break;
			case 2:
			addnew();
			break;
			case 3:
			updateid();
			case 4:
			deleteid();
			break;
			default:
			System.out.println("enter the correct number");
		}
		 }
}
	
class User{
	
	
}