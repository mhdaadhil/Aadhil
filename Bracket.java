import java.util.Scanner;
public class Bracket
{
    public static void main(String[] args )
   {

	int s=0,p=0,c=0;

	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char arr[]=str.toCharArray();
	   for (int i=0;i<arr.length;++i)
		{
 		for (int j=i+1;i<arr.length;++j)
		{
  		   if (arr[i]==40&&arr[j]==41)
	   {
   	     p++;
       	     arr[j]=' ';
   	     break;
           }
	   else if (arr[i]==91&&arr[j]==93)
	    {
 	     s++;
 	     arr[j]=' ';
 	     break;
            }
 	  else if (arr[i]==123&&arr[j]==125)
	    {
 	     c++;
             arr[j]=' ';
              break;
	}
     }
}
System.out.println("()="+p+"\n[]="+s+"\n{}="+c);
//System.out.println(""+s);
//System.out.println("{}="+c);

}
}