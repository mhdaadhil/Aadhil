import java.util.Scanner;
public class L3park{
   public static void main(String[]args){
	   Alloc al=new Alloc();
	   al.show();
   }
}
class Parking{
    int parkid;
	String vehtype;
	String regno;
	String colour;
	//Parking park[][]=new Parking[nofloor][noslot];
	public Parking(int parkid,String vehtype,String regno,String colour){
		this.parkid=parkid;
		this.vehtype=vehtype;
		this.regno=regno;
		this.colour=colour;
	}
	public String toString(){
		
		return parkid+"\t"+vehtype+"\t"+regno+" "+colour;
	}
	
}
class Alloc{
	int parkid=1234;
	int i=1;
	int j=0;
	Parking park[][]=new Parking[20][6];
	Scanner sc = new Scanner(System.in);
	public void show(){
		System.out.println("1.park vehicle\n2.un park vehicle\n3.display");
		int n=sc.nextInt();
		switch(n){
			//case 1:
			//createParking();
			//break;
			case 1:
			parkVehicle();
			break;
			case 2:
			unparkVehicle();
			break;
			case 3:
			display();
			break;
			
			
		}
	}
	//public void createParking(){
		//System.out.println("enter the parkid : ");
		//parkid=sc.nextInt();
		//System.out.println("enter the no of floor");
	    //nofloor=sc.nextInt();
		//System.out.println("enter the no of slot");
		//noslot=sc.nextInt();
		
	   //System.out.println("enter the 1 for back");
		//int n =sc.nextInt();
		//switch(n){
			//case 1:
			//show();
			//break;
		//}
		
	//}
	public void parkVehicle(){
		System.out.println("enter the vehicle type ");
		String vehtype=sc.next();
		System.out.println("enter the reg no");
		String regno=sc.next();
		System.out.println("enter the colour of vehicle");
		String colour=sc.next();
		
		
			
		
		if(vehtype.equals("truck"))
		{
			for(int a=0;a<i;a++){
				if(park[a][0]==null)
				{
					park[a][0]=new Parking(parkid,vehtype,regno,colour);
				}
				else if((a+1)==i) 
					i++;
			}
		}
		else if(vehtype.equals("bike"))
		{
			for(int a=0;a<i;a++)
			{
				for(int b=1;b<3;b++)
				{
					if(park[a][b]==null)
					park[a][b]=new Parking(parkid,vehtype,regno,colour);
				  
				}
				if((a+1)==i)
				{
					i++;
				}
				
			}
			
		}
		else if(vehtype.equals("car"))
			{
			for(int a=0;a<i;a++)
			{
				for(int b=3;b<6;b++)
			    {
					if(park[a][b]==null)
					park[a][b]=new Parking(parkid,vehtype,regno,colour);
				}
				if((a+1)==i)
				{
					i++;
				}
					
			}
			}
	    System.out.println("enter the 1 for back");
		int n =sc.nextInt();
		switch(n){
			case 1:
			show();
			break;
		}
		
	}
	public void unparkVehicle(){
		
	}
	public void display(){
		for(int a=0;a<i;a++)
		{
			for(int b=0;b<6;b++){
				System.out.print(park[a][b]+" | ");
			}
			System.out.println();
		}
	}
}
	

