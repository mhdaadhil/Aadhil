package firnas;

import java.util.Scanner;

class Areaoftriangle {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("enter the width of the triangle :" );
		double base = Scanner.nextDouble();
		
		System.out.println("enter the height of the triangle:");
		double height = Scanner.nextDouble();
		
		//area = (width*height)/2
		double area = (base*height)/2;
		System.out.println("area of triangle is:"+ area);
	}

}
