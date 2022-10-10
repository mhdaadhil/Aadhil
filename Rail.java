import java.util.Scanner;

public class Rail{

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   String username ="mo";
	   String password = "Aa";
	   System.out.println("1.login");
	   int n= sc.nextInt();
	   if (n==1)
	   {
		   Reservation rev = new Reservation();
		   rev.login(username,password);
	   }
    }

}
class Reservation{
	int lower =0;
	int middle=1;
	int upper =1;
	int rac =1;
	int wl=1;
	int b;
	Scanner sc = new Scanner (System.in);
	
	//int si[]=new int [50];
	String name[]=new String[5];
	String gender[]=new String [5];
	int age[]=new int [5];
	String berthpef[]=new String[5];
	
	
	
	public void login(String username,String password) {
		int a=1;
		System.out.println(".....welcome to login page........");
		while (a!=0){
			System.out.println("enter the username");
			String user=sc.nextLine();
			System.out.println("enter the password");
			String pass=sc.nextLine();
			if (pass.equals(password)&&user.equals(username))
			{
				a=0;
				
			}
			if (a==0)
				System.out.println(".......sucessfully loged in.........");
			else
				System.out.println(".......invalid username or password tryagain .........");
		}
		home();
		
		
	}
	public void home() {
		System.out.println("1.avalability 2.bookticket 3.cancelticket 4.myticket");
		
		int a=sc.nextInt();
		switch (a) {
		case 1:
			avalability();
			break;
		case 2:
			bookticket();
			break;
		case 3:
			cancelticket();
			break;
		case 4:
			myticket();
			break;
	     default:
				System.out.println("enter the correct number");
			break;
		
		}
		
	}
	public void avalability() {
		System.out.println("avalable lower berth : "+lower+"\navalable middle berth : "+middle+"\navalable upper berth : "+upper+"\n.................................");
		home();
		
	}
	public void bookticket() {
		System.out.println("..........how many tickets you want to book..........");
	      b=sc.nextInt();
		  
		for(int i=0;i<b;i++)
		{
			System.out.println("name ");
			name[i]=sc.nextLine();
			name[i]=sc.nextLine();
			System.out.println("gender");
			gender[i]=sc.next();
			System.out.println("age");
			age[i]=sc.nextInt();
			System.out.println("berth preference");
			berthpef[i]=sc.next();
			
			System.out.println("..................................");
			 if(wl<=0)
				{
				 System.out.println("ticket is sold out");
				 break;
				}	
			else if(lower<=0)
			{				
		        if(middle>0)
				 berthpef[i]="middle";
				 else if (upper>0)
				 berthpef[i]="upper";
                 else if (rac>0)
                 berthpef[i]="rac";
			     else if (wl>0)
                 berthpef[i]="wl";
			 
				}
				
				else if(middle<=0)
				{   
           	     if(lower>0)
				 berthpef[i]="lower";
				 else if (upper>0)
				 berthpef[i]="upper";
                 else if (rac>0)
                 berthpef[i]="rac";
			     else if (wl>0)
                 berthpef[i]="wl"; 
				}
			   
			   else if (upper<=0)
			   {
				  if(lower>0)
				 berthpef[i]="lower";
				 else if (upper>0)
				 berthpef[i]="upper";
                 else if (rac>0)
                 berthpef[i]="rac";
			     else if (wl>0)
                 berthpef[i]="wl";  
						
			   }
				else if (rac<=0)
				{
				  if (wl>0)
                  berthpef[i]="wl";
			      if(lower>0)
				  berthpef[i]="lower";
				  else if (upper>0)
				  berthpef[i]="upper";
				}
					
						
					
            }
		
		for (int i=0;i<b;i++) 
		{
		    if(berthpef[i].equals("lower"))
			   lower--;
		   
		    else if (berthpef[i].equals("middle"))
		    		
				middle--;
		    
		    else if (berthpef[i].equals("upper"))
		    	upper--;
			else if (berthpef[i].equals("rac"))
				rac--;
		  else if (berthpef[i].equals("wl"))
				wl--;
		}
		System.out.println("your ticket is booked ");
		 
	
		home();
		
	}
	public void cancelticket() {
		
	}
	public void myticket() {
		int si =0,seno=0;
				
		System.out.println("si.no\t\t name\t\tgender\t\tage\t\t berth status\t\t seat no \t\t.");
		for(int i=0;i<b;i++)
		{
			++si;
			++seno;
			
			System.out.println(si+"\t\t"+name[i]+"\t\t"+gender[i]+"\t\t"+age[i]+"\t\t"+berthpef[i]+"\t\t\t"+seno+"\t\t");
		}
		System.out.println("..........................................");
		home();
		
	}
	
}