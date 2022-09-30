import java .util.Scanner ;
public class Rever2{
public static void main(String [] args ){
  Scanner sc = new Scanner(System.in);
String s1=sc.nextLine();
char[] a=s1.toCharArray();

for(int i=0;i<a.length;++i){

if (a[i]==32)
continue;

else if (a[i]<=90){
int index ='Z'-a[i];
System.out.print((char)('A'+index));
}

else if (a[i]<=122){
int index = 'z'-a[i];
System.out.print(" "+(char)('a'+index));
 
}


}

}
}