import java.util.Scanner;


public class Module10{
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  Booking book = new Booking();
	  book.show();
	  
   
   }
} 
abstract class Train{
	int l=0,m=2,u=2,rac=2,wl=2;
	static int k=0;
    PassangerDetails[] pd =new PassangerDetails[10];
    public void avalability() {
    	System.out.println("lower berth ="+l);
    	System.out.println("middle berth ="+m);
    	System.out.println("upper berth ="+u);
    	System.out.println(" Rac ="+rac);
    	System.out.println("waiting list ="+wl);
    }
	
	 
}
class PassangerDetails{
	int si;
	String name;
	int age;
	String gender;
	String berthperf;
	public PassangerDetails(int si,String name, int age, String gender, String berthperf) {
		this.si=si;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.berthperf=berthperf;
	}
	@Override
	public String toString() {
		return si+"\t"+name+"\t"+age+"\t"+gender+"\t"+berthperf ;
	}
}
class Booking extends Train{
	int si=0;
	Scanner sc = new Scanner(System.in);
	public void show() {
		Cancel can = new Cancel();
		System.out.println("............welcome to great kerikalan railway station........... ");
		boolean c=true;
		while(c) {
		System.out.println(" 1.book tickets\n 2.ticket avalability\n 3.cancel ticket\n 4.print book ticket");
	    int n = sc .nextInt();
	    switch (n) {
	    case 1:
	    	book();
	    	break;
	    case 2:
	    	avalability();
	    	break;
	    case 3:
	    	can.cancel();
	    	break;
	    case 4:
	    	print();
	    	break;
	    
	    	
	    }
	  }
	}
    public void book(){
    	
		 System.out.println("enter how many passanger");
		 int n =sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 si+=1;
			
			System.out.println("enter the name");
			String name=sc.next();
			
			System.out.println("enter the age");
			int age=sc.nextInt();
			
			System.out.println("enter the gender");
			String gender=sc.next();
			
			System.out.println("enter the berth perf");
			String berthperf="";
			if(rac<=0&&wl>0)
			{
			
				berthperf="wl";
				wl--;
				pd[k]=new PassangerDetails(si,name, age, gender, berthperf);
				k++;
			}
			else if(l==0&&m==0&&u==0&&rac>0)
			{
				berthperf="rac";
				rac--;
				pd[k]=new PassangerDetails(si,name, age, gender, berthperf);
				k++;
			}
			else if(age>60) {
				if(l>0)
				{
					berthperf="l";
					l--;
					pd[k]=new PassangerDetails(si,name, age, gender, berthperf);
	                k++;
				}
				else 
				{
					berthperf=berthpref();
					pd[k]=new PassangerDetails(si,name, age, gender, berthperf);
					k++;
				}
			}
			else if(age<=5)
			{
				berthperf="no berth";
				pd[k]=new PassangerDetails(si,name, age, gender, berthperf);
				k++;
			}
			else if(wl<=0)
			{
				System.out.println("no ticket avalable");
				System.exit(0);
			}
			else {
				berthperf=berthpref();
				pd[k]=new PassangerDetails(si,name, age, gender, berthperf);
				k++;
			}
	     //al.add(i, new PassangerDetails(name, age, gender, berthperf))
	}
}
 
public String berthpref() {
	System.out.println("enetr the pref");
	   String berth=sc.next();
	   if(berth.equals("l"))
	   {
		   if(l<=0)
		   {
			   System.out.println("lower berth not avalable");
			   berthpref();
		   }
		   else {
			   l--;
		   return "l";
		   }
		 }
	   else if(berth.equals("m"))
	   {
		   if(m<=0)
		   {
			   System.out.println("middle berth not avalable");
			   berthpref();
		   }
		   else {
			   m--;
			   return "m";
		   }
		   }
		   
	   else 
	   {
		   if(u<=0)
		   {
			   System.out.println("lower berth not avalable");
			   berthpref();
		   }
		   else {
			   u--;
			   return "u";
		   }
	   }
	  
	   return "nvn";
   }
 public void print() {
	 System.out.println("name\tage\tgender\tberth");
	 for(int i=0;i<k;i++)
	 {
		 
		 System.out.println(pd[i]);
	 }
 }
}

class Cancel extends Train{
	public void cancel() {
		
	}
}
