import java.util.Scanner;
public class Rotatearray1 {
public static void main(String[] args) {
int i,j,n;
Scanner sc =new Scanner(System.in);
System.out.println("enter the n : ");
n=sc.nextInt();
		
int a[]= new int [10];

System.out.println("enter the numbers ");		
for (i=0;i<n;++i)
{
  a[i]= sc.nextInt();
		   
}
System.out.println("before rotate");
for (i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println();
int temp []=new int [10];
temp[0]=a[n-1];
		
for (i=1;i<n;++i)
{
temp[i]=a[i-1];
}
for (i=0;i<n;++i)
{
a[i]=temp[i];
}
System.out.println("after rotate ");
		
for (i=0;i<n;++i)
{
System.out.println(a[i]);

}
}
}
