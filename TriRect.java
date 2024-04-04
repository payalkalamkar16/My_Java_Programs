import java.util.Scanner;
class Circle1
{
double a,b,res;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("Enter the value of a:");
a=sc.nextDouble();
res=3.14*a*a;
System.out.println("Area of Circle is:"+res);
}
}
class Rectangle1 extends Circle1
{
public void area()
{
System.out.println("Enter the value of a:");
a=sc.nextDouble();
System.out.println("Enter the value of b:");
b=sc.nextDouble();
res=a*b;
System.out.println("Area of Rectangle is:"+res);
}
}
public class Triangle1 extends Rectangle1
{
public void area()
{
System.out.println("Enter the value of a:");
a=sc.nextDouble();
System.out.println("Enter the value of b:");
b=sc.nextDouble();
res=0.5*a*b;
System.out.println("Area of Triangle is:"+res);
}
public static void main(String args[])
{
Circle1 c;
c=new Circle1();
c.area();
c=new Rectangle1();
c.area();
c=new Triangle1();
c.area();
}
}
