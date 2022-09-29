import java.util.Scanner;
public class Repeat{
public static void main(String [] args ){
int i,j,k;

Scanner sc = new Scanner(System.in);
String str = sc.next();
char arr[]= str.toCharArray();

//String str2=" ";
//char arr2[]=str2.toCharArray();
		
int length=arr.length;

for ( i=0;i<length;++i)
  {
     for ( j=i+1;j<length;++j)
      {
         if (arr[i]==arr[j])
	  {
	    for ( k=j;k<length-1;k++)
	     {
	      arr[k]=arr[k+1];
	        }
		 length--;
		 j--;
		   }
	  }
		 		
	}
	for (i=0;i<length;++i){
	    System.out.print(arr[i]);
	}
		
   }
}