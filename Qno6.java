import java.util.Scanner;

/*
 * 6.Given two sorted arrays of distinct elements. There is only 1
difference between the arrays. First array has one element extra added in
between. Find the index of the extra element.
Input:
N = 7
A[] = {2,4,6,8,9,10,12}
B[] = {2,4,6,8,10,12}
Output: 4
Explanation: In the second array, 9 is missing and it's index in the
first array is 4.
Input:
N = 6
A[] = {3,5,7,9,11,13}
B[] = {3,5,7,11,13}
 */

public class Qno6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr1[]=new int [n];
		System.out.println("enter the element");
		for (int i =0;i<n;i++)
			arr1[i]=sc.nextInt();
		System.out.println("enter the size");
		int m=sc.nextInt();
		System.out.println("enter the elements");
		int arr2[]=new int [m];
		
		for (int i=0;i<m;i++)
			arr2[i]=sc.nextInt();
		
		for (int i=0;i<n;i++) {
			if (arr1[i]!=arr2[i]) {
		    System.out.println(i);
		    break;
			}
			
		
		}
				
	}
	
	

}
