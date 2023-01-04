import java.util.Scanner;
public class l3Bus{
   public static void main(String []args){
	   Booking boo=new Booking();
	   boo.adus();
	   
   }
}
class Bus{
	Details det[]= new Details[12];
	String seat[][]=new String[9][2];
	public Bus(){
		int a=1;
		for(int i=0;i<seat.length;i++)
		{
			for(int j=0;j<seat[0].length;j++)
			{
				if(i==6&&j==0)
					a=1;
				if(i<6)
				seat[i][j]=String.valueOf(a++);
			    else
                seat[i][j]="u"+String.valueOf(a++);				
				
			}
		}
		
	    
	}
	public void view(){
		
		for(int i=0;i<seat.length;i++)
		{
			for(int j=0;j<seat[0].length;j++)
			{
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class Details{
	String name;
	int age;
    String gender;
	String mailid;
	long num;
	String pickp;
	String dropp;
	String seatno;
	public Details(String name,int age,String gender,String mailid,long num,String pickp,String dropp,String seatno){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.mailid=mailid;
		this.gender=gender;
		this.num=num;
		this.pickp=pickp;
		this.dropp=dropp;
		this.seatno=seatno;
	}
    public String toString(){
		
		return name+"\t"+age+"\t"+gender+"\t"+mailid+"\t"+"\t"+num+"\t"+pickp+"\t"+dropp+"\t"+seatno; 
	}	
}
class Booking extends Bus{
	int index=0;
	
	Scanner sc = new Scanner(System.in);
	public void adus(){
		System.out.println("1.admin\n2.user");
		int n=sc.nextInt();
		switch(n){
			case 1:
			admin();
			break;
			case 2:
			user();
			break;
		}
		
	}
	public void viewall(){
		System.out.println("NAME\tAGE\tGENDER\tMAIL ID\tNUMBER\tPICK\tDROP\tSEAT NO");
		for(int i=0;i<index;i++)
		{
			System.out.println(det[i]+" ");
		}
	}
	public void admin(){
		System.out.println("1.view all details\n2.avalability");
		int n =sc.nextInt();
		switch(n){
			case 1:
			viewall();
			break;
			case 2:
			view();
		}
	}
	
	
	public void user(){
		
		boolean c=true;
		while(c){
		System.out.println("1.book\2.cancel\n3.avalability4.exit");
		int n=sc.nextInt();
		switch(n){
			case 1:
			book();
			break;
			
			case 2:
			cancel();
			break;
			
			case 3:
			view();
			break;
			
			case 4:
			c=false;
			adus();
			break;
			
			
		}
		}
	
	}
	public void getDetails(){
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		System.out.println("enter the gender");
		String gender =sc.next();
		
		System.out.println("enetr the mail id");
		String mailid=sc.next();
		
		System.out.println("enter the number");
		long num=sc.nextLong();
		
		System.out.println("enter the pickup point");
		String pickup=sc.next();
		
		System.out.println("enter the drop point");
		String dropp=sc.next();
		
		System.out.println("1.book seater \n2.book berth");
		int m=sc.nextInt();
		String seatno="";
		if(m==1)
		seatno=bookseater();
	    else if(m==2)
	    seatno=bookberth();
	
	    det[index]=new Details(name,age,gender,mailid,num,pickup,dropp,seatno);
		index++;
	 
	}
	public String bookseater(){
	     System.out.println("enter the seat number");
		 String s =sc.next();
		 for(int i=0;i<6;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 if(seat[i][j].equals(s))
				 {
					 seat[i][j]=" ";
				 }
			 }
		 }
	     return s;
	}
	public String bookberth(){
		
		 System.out.println("enter the seat number");
		 String s =sc.next();
		 for(int i=6;i<9;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 if(seat[i][j].equals(s))
				 {
					 seat[i][j]=" ";
				 }
			 }
		 }
	     return s;
	}
	
	public void book(){
		System.out.println("1.get Details");
		int n =sc.nextInt();
		switch(n){
			case 1:
			getDetails();
			break;
		}
	}
	public void cancel(){
		System.out.println("1.cancel seater\n2.cancel bearth");
		int n =sc.nextInt();
		switch(n){
			case 1:
			cancelseater();
			break;
			case 2:
			cancelberth();
			break;
		}
	}
	
	
	public void cancelberth(){
		
	}
	public void cancelseater(){
		
	}
	
}