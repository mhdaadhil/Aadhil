package firnas;

import java.util.Scanner;

public class quotientremainder {
	public static void main(String[] args) {
		
		int dividend = 25, divisor = 4;
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("quotient = " + quotient);
		System.out.println("remainder = " + remainder);
		
	}

}
class oddoreven
{
	public static void main(String[] args) {
		int num;
		System.out.println("enter an integer:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if ( num % 2==0 )
		System.out.println("entered number is even");
		else 
			System.out.println("entered number is odd");
	}
}