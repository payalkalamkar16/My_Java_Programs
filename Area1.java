import java.util.Scanner;
public class Area
{
double a,b,c;
Scanner s1=new Scanner(System.in);
public void circle()
{
System.out.println("Enter a value:");
a=s1.nextDouble();
b=3.14*a*a;
System.out.println("Area of Circle is:"+b);
}
public void rect()
{
System.out.println("Enter a value:");
a=s1.nextDouble();
System.out.println("Enter b value:");
b=s1.nextDouble();
c=a*b;
System.out.println("Area of Rectangle is:"+c);
}
public static void main(String args[])
{
Area a1=new Area();
a1.circle();
a1.rect();
}
}
