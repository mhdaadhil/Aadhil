import java.util.Scanner; 
public class Apofcircle {
public static void main(String[] arags)
{
Scanner sc = new Scanner (System.in);

double radius = sc.nextDouble();

double area = 3.14*(radius*radius);
double perimeter = 2*3.14*radius;

System.out.println("area = "+area);
System.out.println("perimeter = "+perimeter);
}
}