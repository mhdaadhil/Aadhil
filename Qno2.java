import java.util.Scanner;
/*
 * . Given a sorted array arr[] of distinct integers. Sort the array into
a wave-like array(In Place). In other words, arrange the elements into a
sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexico graphically smallest
one.
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after sorting it in wave form are 2 1 4 3 5.
Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9

 */

public class Qno2{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("enter the size");
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	     System.out.println("enter the elemenets");
	     for (int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     for (int i=0;i<n;i++) {
	    	 for (int j=0;j<n-i-1;j++) {
	    		 if (arr[j]>arr[j+1]) {
	    			 int temp=arr[j];
	    			 arr[j]=arr[j+1];
	    			 arr[j+1]=temp;
	    		 }
	    	 }
	     }
	     for(int i =0;i<n;i+=2)
	     {
	    	 for (int j=i+1;j<n;j++)
	    	 {
	    	 int temp=arr[i];
	    		 arr[i]=arr[j];
	    		 arr[j]=temp;
	    		 break;
	    	 }
	     }
	     for(int i =0;i<n;i++) {
	    	 System.out.println(arr[i]);
	     }
  }

}
