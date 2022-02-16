package firnas;

import java.util.Scanner;

class Findareaofrectangle {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the length of the rectangle:");
		
		double length = Scanner.nextDouble();
		System.out.println("enter the width of rectangle:");
		
		double width = Scanner.nextDouble();
		
		//area = lenght*width;
		
		double area = length*width;
		System.out.println("area of rectangle is:" + area);
		
	}

}
