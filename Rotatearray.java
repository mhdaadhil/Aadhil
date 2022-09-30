import java.util.Scanner;
public class Rotatearray {
public static void main(String[] args) {
int n,i,j;
Scanner scan=new Scanner (System.in);
System.out.println("enter the n : ");
n=scan.nextInt();
int a[]=new int[n];
System.out.println("enter the numbers ");
for (i=0;i<n;i++){
a[i]=scan.nextInt();
}
System.out.println(a[n-1]);

for (i=0;i<n-1;++i)
{
System.out.println(a[i]);
}
}
}