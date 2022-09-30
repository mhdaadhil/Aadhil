public class Stringdemo{
public static void main(String[] args ){

Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
char a[]=str.toCharArray();
//static String str1 = str;
for (i=str.length()-1;i>=0;i--)
{
System.out.println(a[i]);
}
}
}