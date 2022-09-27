import java.util.Scanner;
public class Twistedprime{
public static void main(String[] args){

Scanner sc= new Scanner (System.in);
int n= sc.nextInt();

int reverse=0,flag=0;
 
while (n!=0)
{
int rem=n%10;
reverse = reverse*10+rem;
n/=10;
}
if (reverse==0||reverse==1)
{
flag=1;
}

for (int i=2;i<=reverse/2;++i)
{
if (reverse%i==0)
{
flag=1;
break;
}
}
if (flag==0)
{
System.out.println(reverse+" it is a twisted prime number");
}
else 
{
System.out.println(reverse+" it is not a twisted prime number");
}
}
}