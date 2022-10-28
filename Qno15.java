import java.util.Scanner;

/*
 * .Given an array nums containing n distinct numbers in the range [0,
n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the
range [0,3]. 2 is the missing number in the range since it does not
appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
 */

public class Qno15{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	     System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		System.out.println("enter the element");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for (int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		
		for (int i=0;i<n;i++) {
			if (arr[i]!=i)
			{
				System.out.println(i);
				break;
			}
			else if (n==i+1) {
				System.out.println(n);
			}
		}
	}
	

}
