package firnas;

public class largestnumber {
	
	public static void main(String[] args) {
		double n1 = 1000000000, n2 = 4.5, n3 = 3.5;
		
		if (n1 >= n2 && n1 >= n3)
		System.out.println(n1 + " is a largest number.");
		
		else if (n2 >= n1 && n2 >= n3)
		System.out.println(n2 + " is a largest number.");
		
		else
		System.out.println(n3 +  "is a largest number.");
	}

}
