import java.util.Scanner;

public class Rever {
public static void main(String[] args) {
int i,j,k;
Scanner scan =new Scanner (System.in);
String str = "abcdefghijklmnopqurstuvwxyz";
String str1= "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
		
char[]a = str.toCharArray();
char[]b = str1.toCharArray();
String letters = scan.nextLine();

char[]c = letters.toCharArray();
		
for (k=0;k<letters.length();k++)
{
if (c[k]<=90)
{
for (i=0,j=26;i<26;i++,j--){
if(c[k]==b[i])
{
System.out.print(b[j]);
}
}
}
else if (c[k]<=122)
{
for(i=0,j=26;i<26;i++,j--)
{
if(c[k]==a[i]){
System.out.print(a[j]);
}
}
}
}
}
} 