import java.util.Scanner;
public class Hospital {
	static Scanner sc = new Scanner(System.in);
	static Management[] mag=new Management[3];
	public static void main(String[] args){
		
		
	
		
		for (int i=0;i<3;i++) {
		System.out.println("enter the patient name");
	    String name=sc.next();
	    System.out.println("eneter the patient id");
	    int id = sc.nextInt();
	    System.out.println("enter the In time");
	    float time =sc.nextFloat();
	    mag[i]=new Management(name, id , time, name);
	    }
	
	 int s=0;
	 System.out.println("name\t\tid \t\tIntime");
	 for (int i=0;i<3;i++)
	 {
		 System.out.println(mag[i].name+"\t\t"+mag[i].id+"\t\t"+mag[i].time);
	 }
	 System.out.println("enter 1 for check register details");
	 int n=sc.nextInt();
	 switch(n) {
	 case 1:
		 details();
		 break;
	 case 2:
		 
	}
	 
		
	
	
}
	public static void details() {
		System.out.println("enter the name");
		String pname=sc.next();
		System.out.println("enter the id");
		int pid=sc.nextInt();
		int n=3;
		for (int i=0;i<n;i++)
		{
			if (mag[i].name.equals(pname)&&mag[i].id==pid) {
				System.out.println("your name already in record now you can interact with two medical professionals");
				
			}
			else {
				System.out.println("");
			}
		}
  }
	public static void medpro() {
		
	}
}
	class Management{
		   Scanner sc = new Scanner(System.in);
			String name;
			int id;
			float time;
			//String deseasename;
			public Management(String name,int id,float time,String deseasename){
				this.name=name;
				this.id= id;
				this.time=time;
				//this.deseasename=deseasename;
				
			}
			
				
				
			}
