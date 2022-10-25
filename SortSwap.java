package zohoinc;

import java.util.Scanner;

public class SortSwap {
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
