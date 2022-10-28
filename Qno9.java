import java.util.Scanner;

/*9. Given two sorted arrays array1 and array2 of size m and n
respectively. Find the median of the two sorted arrays.
Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for {1,2,3,5,6,7,9} is 5
Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
*/


public class Qno9{
	public static void main(String[] args) {
		float median=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
	    
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		}
		System.out.println("enter the size of second array");
		int m=sc.nextInt();
		int arr1[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
		   arr1[i]=sc.nextInt();
		}
		int o=m+n;
		int temp[]=new int[o];
		int k=0;
		for (int i=0;i<n;i++,k++)
		{
			temp[k]=arr[i];
		}
		for (int i=0;i<m;i++,k++)
		{
			temp[k]=arr1[i];
		}
		
		for (int i=0;i<o;i++)
		{
			for (int j=0;j<o-i-1;j++)
			{
				if (temp[j]>temp[j+1]) {
				int temo=temp[j];
				temp[j]=temp[j+1];
				temp[j+1]=temo;
				}
				
			}
		}
		for(int i=0;i<o;i++)
		{
			System.out.println(temp[i]);
		}
		
		if(o%2!=0)
		{
			System.out.println(temp[o/2]);
		}
		else if (o%2==0)
		{
			int b=o/2;
			median=((temp[b]+temp[b-1])/2);
			System.out.println(median);
		}
		
	}

}
