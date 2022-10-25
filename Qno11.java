package zohoinc;

import java.util.Scanner;

/*11.The hiring team aims to find 3 candidates who are great collectively.
Each candidate has his or her ability expressed as an integer. 3
candidates are great collectively if product of their abilities is
maximum. Given abilities of N candidates in an array arr[], find the
maximum collective ability from the given pool of candidates.
Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}
Output: 1200
Explanation:
Multiplication of 10, 6 and 20 is 1200.
Input:
N = 5
Arr[] = {-10, -3, -5, -6, -20}
Output: -90
Explanation:
Multiplication of -3, -5 and -6 is -90.
*/
public class Qno11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		
		for (int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-i-1;j++) {
				if (arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int sum=arr[0]*arr[1]*arr[2];
		System.out.println(sum);
		
		
		
		
		

}
}

