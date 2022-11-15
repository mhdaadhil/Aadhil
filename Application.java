import java.util.Scanner;

public class Application{
	   public static void main(String[] args) {
		   Bankk b = new Bankk();
			b.details();
	}
	}
class Bankk{
	Scanner sc = new Scanner(System.in);
	int custid[]=new int [10];
	int accno[]=new int[50];
	int balance[]=new int[50];
	String pwd[]=new String[50];
	String name[]=new String[50];
	int amthis[]=new int[50];
	int balhis[]=new int[50];
	String Tratyp[]=new String[50];
	int k=4;
	int ind=0;
	int di=55;
	int dac=55055;
	int inb=10000;
	int l=0;
	int o=0;
	
	
	public void details(){
		custid[0]=11;
		custid[1]=22;
		custid[2]=33;
		custid[3]=44;
		
		accno[0]=11011;
		accno[1]=22022;
		accno[2]=33033;
		accno[3]=44044;

		balance[0]=10000;
		balance[1]=20000;
		balance[2]=30000;
		balance[3]=40000;

		pwd[0]="Apipnbjm";
		pwd[1]="kolaim";
		pwd[2]="qewqwe";
		pwd[3]="supeme";
		
		name[0]="madhu";
		name[1]="kumar";
		name[2]="rahul";
		name[3]="robin";
		System.out.println("custid\taccno\tname\tbalance\tpwd");
		for (int i =0;i<k;i++){
			
			System.out.println(custid[i]+"\t"+accno[i]+"\t"+name[i]+"\t"+balance[i]+"\t"+pwd[i]);
		}
		start();
		
	}
	public void start(){
	    System.out.println("enter the 1 to add new coustomer and 2 to login and 3 to view");
		int b=sc.nextInt();
		switch (b){
			case 1:
			check();
			break;
			case 2:
			login();
			break;
			case 3:
			view();
			break;
		}
		}
	public void check(){
		//int n=sc.nextInt();
		System.out.println("how many members");
		int n =sc.nextInt();
	  //  System.out.println("enter the details");
	    for (int i=0;i<n;i++,k++)
		{
	   // System.out.println("enter the cusid");
		//custid[k]=sc.nextInt();
		//System.out.println("enter the accno");
		//accno[k]=sc.nextInt();
		System.out.println("enter the name");
		name[k]=sc.next();
		//System.out.println("enter the balance");
		//balance[k]=sc.nextInt();
		System.out.println("enter the pass");
		String pwas=sc.next();
		custid[k]=di;
		di=di+11;
		accno[k]=dac;
		dac=dac+11011;
		balance[k]=inb;
		pwd[k]=encryption(pwas);
		}
		start();
	}
	public String encryption(String s) {
		char arr[]=s.toCharArray();
		String p="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='z')
			{
				arr[i]='a';
				p=p+arr[i];
			}
			else if(arr[i]=='Z')
			{
				arr[i]='A';
				p=p+arr[i];
			}
			else if (arr[i]=='9')
			{
				arr[i]='0';
				p=p+arr[i];
			}
			else
			{
				arr[i]++;
				p=p+arr[i];
			}
			
		}
		return p;
		
	}
	public void login() {
		int flag=0;
		System.out.println("enter the id ");
		int id = sc.nextInt();
		System.out.println("enter the password");
		String password =sc.next();
		String ep=encryption(password);
		int b=1;
		for (int i=0;i<k;i++)
		{
			if(id==custid[i] && ep.equals(pwd[i]))
			{
				//System.out.println("authentication succesfull");
			       ind = i;
				   System.out.println(ind);
				   flag=1;
				   break;
		    }
			else {
				flag=0;
			}
			
	}
		if (flag==1)
		{
			System.out.println("authentication succesfull");
			basic();
		}
		else {
			System.out.println("enter crt id password");
			login();
		}
		
	}
	
	public void view() {
		System.out.println("custid\taccno\tname\tbalance\tpwd");
		for (int i =0;i<k;i++){
			
			System.out.println(custid[i]+"\t"+accno[i]+"\t"+name[i]+"\t"+balance[i]+"\t"+pwd[i]);
		}
		start();
		
	}
	
	public void basic() {
		System.out.println("1.Atm withdrawal  2.cash deposit   3.Account transfer  4.transation history");
		int a=sc.nextInt();
        switch(a)
		{
	     case 1:
		 atm();
		 break;
		 case 2:
		 deposit();
		 break;
		 case 3:
		 transfer();
		 break;
		 case 4:
		 transation();
		 break;
		}
	}
	public void transfer() {
		int flag=0;
		int in=0;
		System.out.println("enter 1 for transfer");
		int a=sc.nextInt();
		if (a==1)
		{
			System.out.println("enter the account no that you want to transfer");
			int acc=sc.nextInt();
			for(int i=0;i<k;i++)
			{
				if (acc==accno[i])
				{
					flag=1;
					in=i;
					System.out.println(in);
				}
				else 
				{
					flag=0;
				}
				if (flag==1)
				{
					System.out.println("enter the amount you want to transfer");
					int amo=sc.nextInt();
					System.out.println("enter the password");
			        String p=sc.next();
		         	if(p.equals(pwd[ind]))
					{
					  if (balance[ind]-amo>=1000){
					    balance[ind]-=amo;
						balance[in]+=amo;
						
						amthis[l]=amo;
					    balhis[l]=balance[ind];
						Tratyp[l]="cash transfer";
					    l++;
						o++;
						
						System.out.println("money transferd sucessfully");
						menu();
						
					  }
					  else {
							System.out.println("there is lesser minimum balance so transfer cannot be done");
							//transfer();
						}
						System.out.println("click 1 to check balanc");
				int b=sc.nextInt();
				if (b==1)
				{
					System.out.println(name[ind]+" "+balance[ind]);
					 start();
				}
						
					}
					else 
					{
						System.out.println("enter crt password");
						transfer();
						
					}
					
					
				}
			
			}
			
		}
		
		
	}
	public void deposit() {
		System.out.println("enter 1 for cash deposit");
		int a=sc.nextInt();
		if (a==1)
		{
			System.out.println("enter the amount you want to credit");
			int amt=sc.nextInt();
			System.out.println("enter the password");
			String p=sc.next();
			if(p.equals(pwd[ind]))
			{
				balance[ind]+=amt;
				amthis[l]=amt;
				balhis[l]=balance[ind];
				Tratyp[l]="cash deposit";
				l++;
				o++;
				System.out.println("sucessfully cretid ");
				System.out.println("click 1 to check balanc");
				int b=sc.nextInt();
				if (b==1)
				{
					System.out.println(name[ind]+" "+balance[ind]);
                     menu();
					 
				}
				
				
			  
			}
			else {
				System.out.println("your pssword is incorrect");
				deposit();
			}
		}
	}
	public void atm() {
		System.out.println("enter 1 for withdraw");
		int a=sc.nextInt();
		if (a==1){
			System.out.println("enter the amount you want to debit");
			int amt=sc.nextInt();
			System.out.println("enter password");
			String p=sc.next();
			if (pwd[ind].equals(p))
			{
				if (balance[ind]-amt>=1000)
				{
					balance[ind]-=amt;
					amthis[l]=amt;
					balhis[l]=balance[ind];
					Tratyp[l]="cash withdraw";
					l++;
					o++;
					System.out.println("amount withdrawn sucessfully");
				}
				else 
				{
					System.out.println("there is lesser minimum balance so withdrawal cannot be done");
				}
				System.out.println("click 1 to check balanc");
				int b=sc.nextInt();
				if (b==1)
				{
					System.out.println(name[ind]+" "+balance[ind]);
					 //start();
					 menu();
					
				
			}
			else {
				System.out.println("your password is incorrect");
				atm();
			}
		}
		
	}
}
public void transation(){
		System.out.println("trans type\t\tamount\t\tbalance");
		for (int i=0;i<o;i++)
		{
			System.out.println(Tratyp[i]+"\t\t"+amthis[i]+"\t\t"+balhis[i]);
		}
		menu();
	}
public void menu(){
	 System.out.println("1.back  2.main menu");
						
						int c=sc.nextInt();
						switch (c)
						{
						case 1:
							start();
							break;
						case 2:
							basic();
							break;
					    }
}
}

	
	
	
