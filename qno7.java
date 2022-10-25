package zohoinc;

import java.util.Scanner;

/* 7. Given an array of distinct elements. Find the third largest element
in it. Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be
5 because it is the 3 largest element in the array A.

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3

Input:
N = 2
A[] = {10,2}
Output: -1 */

public class qno7 {
     public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the Size");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the elements ");
		for (int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i =0;i<n;i++) {
			for (int j =0;j<n-i-1;j++) {
				if (arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
			
		}
		if (n<3)
		{
			System.out.println(-1);
		}
		else {
			System.out.println(arr[2]);
		}
		
	}
}
