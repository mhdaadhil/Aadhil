//given an integer array arr of size n ,you need to sum the elements of arr

import java.util.Scanner;
public class Sumofarray {
public static void main(String[] args) {
int n,i,sum=0;
int a[]=new int [10];
System.out.println("enter the n");
Scanner scan =new Scanner (System.in);
n=scan.nextInt();
System.out.println("enter the number");
for (i=0;i<n;++i)
{
a[i]=scan.nextInt();
}
for (i=0;i<3;++i)
{
sum+=a[i];			
}
System.out.println("sum of array is "+sum);
}

}