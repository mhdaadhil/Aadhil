import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
float firstnum=sc.nextFloat();
float secondnum=sc.nextFloat();
float Thirdnum=sc.nextFloat();

float avg =((firstnum+secondnum+Thirdnum)/3);
System.out.println("the average is "+avg); 


}
}