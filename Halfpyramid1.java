//program to print half pyramid using number

import java.util.Scanner ;

public class Halfpyramid1{
public static void main(String []args ){
int row ;
int i,j;
System.out.println("enter the rows");
Scanner scan=new Scanner (System.in);
row =scan.nextInt();

for (i=1;i<=row;++i)
{
for(j=1;j<=i;++j)
{
 System.out.print("*");
}
System.out.println();

}
}
}