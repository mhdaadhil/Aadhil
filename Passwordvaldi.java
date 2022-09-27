import java.util.Scanner;
public class Passwordvaldi{
public static void main(String[] args) {
	int n=1;
	int spl=0;
	int num=0;
	int low =0;
	int cap=0;
	Scanner sc = new Scanner (System.in);
    
    
    while (n!=0)
    {
    	String pass= sc.next();
        char arr[]= str.toCharArray();
        
    	 for (int i=0;i<str.length();++i)
    	    {
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
    		 System.out.println("password must be upper case and lower case numbers and spl charactr  ");
    }
    
   
    if (n==0)
    	System.out.println("password accepted ");
    else 
    	System.out.println("password not accepted ");
}

} 