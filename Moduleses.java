import java.util.Scanner;
public class Moduleses{
	public static void main(String[] args) {
		Login log=new Login();
		log.home();
   }
}
class Login{
	String str;
	String pass;
        private static Scanner sc=new Scanner(System.in);
public void  home (){
	System.out.println("1.admin\n2.user");
	int input= sc.nextInt();
	switch (input){
	    case 1:
	       abcd();
	       break;
	    case 2:
	       abcd();
	       break;
	    default:
	       System.out.println("enter the correct num");
	       break;	
		}
	}
public void abcd(){
	System.out.println("1,sign up");
        System.out.println("2.sign in");
	int input2= sc.nextInt();
	switch (input2){
	case 1:
		signup();
		break;
       case 2:
	       signin();
	       break;
        default:
		System.out.println("enter the correct num");
		break;			
		}
}
public void signup(){
	int n=1,spl=0,num=0,low =0,cap=1;
	System.out.println("enter the user name to sign up : ");
	str = sc.next();
	System.out.println("enter the password ");
	while (n!=0){
	   pass = sc.next();
	   char arr[]= pass.toCharArray();
	   for (int i=0;i<pass.length();++i){
		if (arr[i]>=33 && arr[i]<=47 || arr[i]== 64)
    	    		spl=1;
    	    	if (arr[i]>=46 && arr[i]<=57)
    	    		num=1;
    	    	if (arr[i]>=65 && arr[i]<=90)
    	    		low=1;
    	    	if (arr[i]>=97 && arr[i]<=122)
    	    		cap=1;
			}
			if (spl==1 && num==1 && low==1 && cap==1)
	             n=0;
	    	 else 
	    		 System.out.println("password must be upper case lower case and number and spl character");
		}
		if (n==0)
			System.out.println("successfully you signed up"); 
                  signin();
 	 }
public void signin(){
System.out.println("welcome to signin page");
      Scanner sc = new Scanner (System.in);
      System.out.println("enter the user name");
      String usern= sc.next();
      System.out.println("enter the password");
      String pass1=sc.next();
        if (usern.equals(str)&& pass.equals(pass1){
	    System.out.println("suscessfully loged in");
	       }
	 else{
	    System.out.println("Invalid ! username or password ");
        signup();
   }}}