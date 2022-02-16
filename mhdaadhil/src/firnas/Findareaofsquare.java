package firnas;

import java.util.Scanner;

class Findareaofsquare {
	public static void main(String[] args) {
		System.out.println("enter the side of square:");
	   //capture the user input
		Scanner Scanner = new Scanner(System.in);
		//storing the captured value in a variable
		double side = Scanner.nextDouble();
		//AREA OF SQUARE = SIDE*SIDE
		double area = side*side;
		System.out.println("area of square is:"+area);
	}

}
