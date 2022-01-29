package firnas;

public class swaptwonumberexercise {
	
	public static void main(String[] args) {
		
		float first = 2.50f, second = 4.50f;
		System.out.println("--before swap--");
		System.out.println("first number = " + first );
		System.out.println("second number = " + second);
		
		//value of assigned to temporary
		float temporary=first;
		
		// value of first assigned to first 
		first = second;
		
		// value of temporary (which contains the initial value of assigned to second)it is assigned to the second.
		
		second=temporary;
		
	
	   
	   
	    System.out.println("--after swap--");
		System.out.println("first number = " + first );
		System.out.println("second number = " + second);
	}

}
