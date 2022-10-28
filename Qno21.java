import java.util.Scanner;
/*You’re given an array. Print the elements of the array which are
greater than its previous elements in the array.
Input : 2, -3, -4, 5, 9, 7, 8
Output: 2 5 9 You should solve this question in O(n) time*/

public class Qno21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for (int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    for (int i=0;i<n-1;i+=2)
	    {
	       if (arr[i]>arr[i+1])
	    	   System.out.println(arr[i]);
	       else if (arr[i]<arr[i+1])
	    	   System.out.println(arr[i+1]);
	    }
		
	}

}
