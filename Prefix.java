import java.util.Scanner;
public class Prefix{
public static void main(String [] args){
 Scanner sc =new Scanner(System.in);
 System.out.println("enter the elements");
 int n=sc.nextInt();

 String str[]=new String[n];
 System.out.println("enter the words");

 for (int i=0;i<n;++i)
 {
    str[i]=sc.next();
 }
    String result =str[0];
 for(int i=1;i<n;++i)
 {
  result=prefix(result,str[i]);
 }
 System.out.println(result);
 }
 public static String prefix(String s,String t){
 String res= "";
 for(int i=0,j=0;i<s.length()&&j<t.length();i++,j++)
 {
 if (s.charAt(i)!=t.charAt(j))
    break;
  res+=s.charAt(i);

  }
   return res;
  }

}
