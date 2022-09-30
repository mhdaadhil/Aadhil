import java.util.Scanner;

public class Minmax{
public static void main(String []args){
 int n,i,j,temp;
System.out.println("enter the n :");

Scanner sc = new Scanner (System.in);
n=sc.nextInt();
int arr[]= new int [10];

for(i=0;i<n;i++)
{
  arr[i]=sc.nextInt();

}
for(i=0;i<n-1;i++)
for (j=0;j<n-1;++j)
{
if (arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}

}
//int max = arr[n-1],min =arr[0];

System.out.println("the maximum value = "+arr[n-1]);
System.out.println("the minimum value ="+arr[0]);
}
}