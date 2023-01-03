import java.util.Scanner;
public class Crm3{
  public static void main(String []args){
	  Scanner sc = new Scanner(System.in);
	  String s=sc.next();
	  String str="";
	  char arr[]=s.toCharArray();
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
			  if (arr[i+1]=='a'||arr[i+1]=='e'||arr[i+1]=='i'||arr[i+1]=='o'||arr[i+1]=='u'){
				  str+=arr[i];
				  str+=arr[i+1];
			  }
		  }
		  else
			  str+=arr[i];
	   }
	   System.out.println(str);
	
  }
}