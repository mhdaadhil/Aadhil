//program to print half pyramid using *

import java.util.Scanner;

public class Halfpyramid{
public static void main(String[] args){
int row;
int i,j,number=1;
System.out.println("enter the rows ");
Scanner sc = new Scanner(System.in);
row=sc.nextInt();

for (i=1;i<=row ;++i)
{
for (j=1;j<=i;++j)
{
   System.out.print(number );
       ++number ;
}
    System.out.println();
}
}

}