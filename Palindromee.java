import java.util.Scanner;
public class Palindromee{
public static void main(String[] args){
 int flag=0;
 Scanner sc = new Scanner(System.in);
 String str= sc.nextLine();
 char arr[]=str.toCharArray();
 String str2 = "";
 for (int i=0;i<arr.length;i++){
      if(arr[i]>=32&&arr[i]<=47||arr[i]>=58&&arr[i]<=64)
	  continue;
      else
       str2+=arr[i];
        }
  System.out.println(str2);
   for (int i=0;i<str2.length();i++){
      if (str2.charAt(i)!=str2.charAt(str2.length()-1))
	       flag =1;
	        break;
	        }
    if (flag==1)
      System.out.println("it is not a palandrome");

	else
	System.out.println("it is a palamdrome");
}
}