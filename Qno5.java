import java.util.Scanner;

public class Qno5{
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the k");
		int k=sc.nextInt();
		System.out.println("enter the n");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the element");
		for (int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i =0;i<n;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	 // for (int i=0;i<n;i++)
	  //System.out.println(arr[i]);
		for (int i=0;i<n;i++)
		{
			count=1;
			int a=k-arr[i];
		   for(int j=i+1;j<n;j++)
		   {
		       a=a-arr[j];
		       count++;
		       if (a==0)
		       {
		    	   if (count>=count1) {
		    		   count1=count;
		    	   }
		       }
		   }
		}
		System.out.println(count1);
	}
}