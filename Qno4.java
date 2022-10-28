/*
 * Union of two arrays can be defined as the common and distinct elements
in the two arrays. Given two sorted arrays of size n and m respectively,
find their union.
Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation:Distinct elements including both the arrays are:1 2 3 4 5
Input:
n = 5, arr1[] = {2, 2, 3, 4, 5}
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation:Distinct elements including both the arrays are: 1 2 3 4 5
Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 1 2
Explanation: Distinct el
 */
import java.util.Scanner;

public class Qno4{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size ");
	int n= sc.nextInt();
	int arr[]=new int [n];
	System.out.println("enter the element ");
	for (int i =0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the size ");
	int m=sc.nextInt();
	int arr1[]=new int [m];
	System.out.println("enter the element ");
	for (int j=0;j<m;j++)
	{
		arr1[j]=sc.nextInt();
	}
	int k=0;
	int o=m+n;
	int temp[]=new int [o];
	for (int i=0;i<n;i++,k++) {
		temp[k]=arr[i];
	}
	for (int j=0;j<m;j++,k++)
	{
		temp[k]=arr1[j];
	}
	for (int i=0;i<o;i++) {
		for (int j=0;j<o-i-1;j++)
		{
			if (temp[j]>temp[j+1])
			{
				int t=temp[j];
				temp[j]=temp[j+1];
				temp[j+1]=t;
			}
		}
	}
	for (int i=0;i<o;i++)
	{
		for (int j=i+1;j<o;j++)
		{
			if (temp[i]==temp[j])
				temp[j]=0;
		}
	}
	for (int i=0;i<o;i++)
	{
		if (temp[i]!=0)
			System.out.println(temp[i]);
	}
	
}
}