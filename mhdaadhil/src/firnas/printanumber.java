package firnas;

import java.util.Scanner;

public class printanumber {
	public static void main(String[] args) {
		
		//create a reader instance which takes 
		//input from standared input-keyboard
		
		Scanner reader = new Scanner(System.in);
		System.out.println("enter number:");
		
		//nextint() reads the next integer from the keyboard 
		int number = reader.nextInt();
		
		//println() prints the following line to the output screen 
		System.out.println("you entered:" + number);
		
	}	

}
