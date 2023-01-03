import java.util.Scanner;
public class Crm4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the input");
		String str=sc.next();
		int r=0;
		int l=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			  r++;
		    else if(str.charAt(i)==')')
			  l++;
				
		}
		if(l==r)
		System.out.println(0);
	    else 
		 System.out.println(1);	
		
	}
	
}