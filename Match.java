import java.util.Scanner;


public class Match {
    public static void main(String[] args) {
    	int flag=0;
		Scanner sc = new Scanner (System.in);
		String s =sc.next();
		String p =sc.next();
		if (s.length()==p.length())
		{
		for (int i=0;i<s.length();i++){
				if (s.charAt(i)==p.charAt(i))
				   flag=1;
				else if(p.charAt(i)=='*'||p.charAt(i)=='.'){
					flag=1;
				}
				else if (s.charAt(i)!=p.charAt(i))
					flag=0;
				break;
		  }
	}
		else if (s.length()!=p.length())
		{
			flag=0;
		}
		if (flag==1)
			System.out.println("true");
		else 
			System.out.println("false");
	}
}
