import java.util.Scanner;
public class Crm2{
   public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   int n =sc.nextInt();
	   int k=1;
	   int a=0;
	   String pat[]=new String[n];
	   String pattern="";
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<=i;j++){
			   if(j!=0){
				   pattern+="*"+k;
			       System.out.print("*"+k++);
			   }
			   else{
				   pattern+=k;
				      System.out.print((k++));
			   }
			   if(j==i){
				   System.out.println();
			   }
		   }
		   pat[a]=pattern;
		   pattern="";
		   a++;
	   }
	   for(int i=n-1;i>=0;i--)
	   {
		   System.out.println(pat[i]);
	   }
   }
}