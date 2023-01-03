import java.util.Scanner;
public class Crm1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int m=n/2;
		des(m,n,arr);
		
	}
	public static void des(int m,int n,int arr[]){
		for(int i=m;i<n;i++)
		{
			for(int j=m;j<n-1;j++)
			{
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}