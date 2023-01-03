import java.util.Scanner;
public class Crm6{
  public static void main(String []args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("enter the element");
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int sum=arr[0];
	  for(int i=1;i<n;i++)
	  {
		  sum+=arr[i];
		  for(int j=0;j<=i;j++){
			  System.out.print(arr[j]);
			  
			  if(j!=i)
			  System.out.print("+");
				  
		  }
		  System.out.print("="+sum);
		  System.out.println();
	  }
	  
  }
}
