import java.util.Scanner;

/* Given two arrays A and B contains integers of size N and M, the task
is to find numbers which are present in the first array, but not present
in the second array.
Input: N = 6, M = 5
A[] = {1, 2, 3, 4, 5, 10}
B[] = {2, 3, 1, 0, 5}
Output: 4 10
*/

public class Qno10{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size");
	    int m=sc.nextInt();
	    int arr[]=new int[m];
	    for(int i=0;i<m;i++)
	    {
	    	arr[i]=sc.nextInt(); 
	    }
	    System.out.println("enter the second size");
	    int n=sc.nextInt();
	    int arr2[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	    	arr2[i]=sc.nextInt(); 
	    }
	    for (int i=0;i<m;i++)
	    {
	    
	    	for (int j=0;j<n;j++)
	    	{
	    		if (arr[i]==arr2[j])
	    		{
	    			arr[i]=0;
	    		}
	    	}
	    }
	    for (int i=0;i<m;i++)
	    {
	    	if (arr[i]!=0)
	    		System.out.println(arr[i]);
	    	
	    }
	}

}
