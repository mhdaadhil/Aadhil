import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Taxi {
  public static void main(String[] args) {
	  Booking tax = new Booking();
	tax.nain();
}
}
class Taxii{
	
	static int taxicount=0;
	int id;
	boolean booked;
	char currentspot;
	int freetime;
	int totalearning;
	List<String> trips;
	
	public Taxii(){
	   booked =false;
	   currentspot ='A';
	   totalearning=0;
	   trips=new ArrayList<String>();
	   taxicount=taxicount+1;
	   id =taxicount;
	}
    
		
	
	public void setDetails(boolean booked ,char currentspot,int freetime,int totalearning,String tripdetail){
    	
		this.booked=booked;
		this.currentspot=currentspot;
		this.freetime=freetime;
		this.totalearning=totalearning;
		this.trips.add(tripdetail);
	}
	public void printDetails() {
		
		System.out.println("taxi -  "+this.id+"total earning - "+this.totalearning);
		System.out.println("taxi id       Booking id       from     to       pickuptime      droptime       amount  ");
		for(String trip : trips) {
			System.out.println(id +"               "+trip);
		}
		System.out.println("............................................................................................");
	}
	
}
class Booking extends Taxii{
	
	public void nain() {
		List<Taxii> taxis =createTaxis(6);
		Scanner sc = new Scanner(System.in);
		int id=1;
		while(true) {
			System.out.println("1 for Book taxi\n2 for print taxi details");
			int choice =sc.nextInt();
			switch (choice) {
			case 1:
			{
				int customerid=id;
				System.out.println("enter the pickup point");
				char pickuppoint=sc.next().charAt(0);
				System.out.println("enter the drop point");
				char droppoint =sc.next().charAt(0);
				System.out.println("enter the pickup  time");
				int pickuptime=sc.nextInt();
				
				if(pickuppoint<'A' || droppoint>'F'||pickuppoint>'F'||droppoint<'A' )
				{
					System.out.println("enter the valid pickup");
					
				}
				List <Taxii> freeTaxis= getFreeTaxis(taxis,pickuptime,pickuppoint);
				
				
				if(freeTaxis.size()==0)
				{
					System.out.println("no taxi is allowed");
					return ;
				}
				//sort based on eraning.
				Collections.sort(freeTaxis,(a,b)->a.totalearning-b.totalearning );
				
				bookTaxi(customerid,pickuppoint,droppoint,pickuptime,freeTaxis);
				id++;
				break;
			}
			case 2:
			{
				
				for(Taxii t: taxis)
					t.printDetails();
			}
			}
		}
		
		
		
	}
	public void bookTaxi(int customerid, char pickuppoint, char droppoint, int pickuptime, List<Taxii> freeTaxis) {
		  int min=999;
		  
		  int disbtwpicdrop=0;
		  
		  int earning=0;
		  
		  int nextfreetime=0;
		 
		  char nextspot='z';
		 
		  Taxii bookedTaxi=null;
		 
		  String tripdetail = "";
		  
		  for (Taxii t: freeTaxis) {
			  
			  int distbtwcusandtax=Math.abs((t.currentspot-'0')-(pickuppoint -'0'))*15;
			  
			  if(distbtwcusandtax< min)
			  {
				  bookedTaxi =t;
				  
				  disbtwpicdrop = Math.abs((droppoint-'0')-(pickuppoint-'0'))*15;
				   
				  earning =(disbtwpicdrop-5)*10;
				  
				  int droptime= pickuptime+disbtwpicdrop/15;
				  
				  
				  nextfreetime=droptime;
				  
				  tripdetail = customerid  +  "           "+customerid+"             "+pickuppoint+"                "+droppoint+"                    "+pickuptime+"          "+droptime+"        "+earning;                          
				  
			  }
			  
		  }
		  bookedTaxi.setDetails(true, nextspot, nextfreetime, bookedTaxi.totalearning-earning, tripdetail);
		  System.out.println("taxi  "+bookedTaxi.id+  " booked");
	}
	
	
	public List<Taxii> getFreeTaxis(List<Taxii> taxis,int pickuptime,char pickuppoint){
		 List<Taxii>freetaxis=new ArrayList<Taxii>();
		 
		 for(Taxii t:taxis)
		 {
			 if(t.freetime<=pickuptime && (Math.abs(t.currentspot-'0')-(pickuppoint -'0'))<=pickuptime-t.freetime)
			 {
				 freetaxis.add(t);
			 }
			 
		 }
		
		
		return freetaxis;
		
	}
	public List<Taxii> createTaxis(int n){
		
		List <Taxii> taxis =new ArrayList<Taxii>();
		
		for(int i=1;i<n;i++)
		{
			Taxii t= new Taxii();
			taxis.add(t);
		}
		
		return taxis;
	}
	
}

