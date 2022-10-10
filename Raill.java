import java.util.Scanner;
public class Raill{
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
		int b,k;
		Scanner sc = new Scanner (System.in);
		
		//int si[]=new int [50];
		String name[]=new String[5];
		String gender[]=new String [5];
		int age[]=new int [5];
		String berthpref[]=new String[5];
		
		
		
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
				name[k]=sc.nextLine();
				name[k]=sc.nextLine();
				System.out.println("gender");
				gender[k]=sc.next();
				System.out.println("age");
				age[k]=sc.nextInt();
				System.out.println("berth preference");
				berthpre();
				if (lower==0&&upper==0&&middle==0&&rac==0)
				{
					berthpref[k]="W L";
					wl--;
				}
				else if(lower==0&&upper==0&&middle==0) {
					berthpref[k]="RAC";
					rac--;
				}
				else if(age[k]<=5)
				{
					berthpref[k]="-------";
					continue;
				}
				else if (age[i]>=60)
			{
				if (lower!=0)
					lower--;
				else if(lower==0)
				berthpre();
		     }
			}
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
				
				System.out.println(si+"\t\t"+name[i]+"\t\t"+gender[i]+"\t\t"+age[i]+"\t\t"+berthpref[i]+"\t\t\t"+seno+"\t\t");
			}
			System.out.println("..........................................");
			home();
			
		}
		public void berthpre() {
			System.out.println("1.lower\n2.middle \n3.upper");
			 int a=sc.nextInt();
			 switch (a) {
			 case 1:
				 lower();
				 break;
			 case 2:
				 middle();
				 break;
			 case 3:
				 upper();
				 break;
			 }
			 
			 
		}
		public void lower() {
				if(lower<=0)
				{
					System.out.println("Lower berth is booked try other berth");
				
				berthpre();
				}
				else
					berthpref[k]="Lower";
		 }
		public void middle () {
			if(middle<=0)
			{
				System.out.println("middle berth is booked try other berth");
			berthpre();
			}
			else
				berthpref[k]="middle";
		}
		public void upper() {
			if(upper<=0)
			{
				System.out.println("middle berth is booked try other berth");
				berthpre();
			}
			else
				berthpref[k]="middle";
		}
}
