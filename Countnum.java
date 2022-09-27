import java.util.Scanner;
public class Countnum{
public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
System.out.println("enter the size");

int count=0;
int n=sc.nextInt();
System.out.println("enter the numbers");

int arr[]=new int[n];
int count1[]=new int [n];
		
for(int i=0;i<n;++i)
{
arr[i]=sc.nextInt();
count1[i]=-1;
}

for (int i=0;i<n;++i)
{
count =1;
for (int j=i+1;j<n;++j)
{
if (arr[i]==arr[j])
{
count++;
count1[j]=0;
}
}
if (count1[i]!=0)
{
count1[i]=count;
}
}

System.out.println("count of elemenet is ");
for (int i=0;i<n;++i)
{
if (count1[i]!=0)
System.out.println(arr[i]+"-"+count1[i]);
}
}
} 