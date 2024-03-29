import java.util.Scanner;
class Circle
{
float a,b,res;
Scanner sc=new Scanner(System.in);
public void area_c()
{
System.out.println("Enter the value of a:");
a=sc.nextFloat();
res=3.14f*a*a;
System.out.println("Area of Circle is:"+res);
}
}
class Rectangle extends Circle
{
public void area_r()
{
System.out.println("Enter the value of a:");
a=sc.nextFloat();
System.out.println("Enter the value of b:");
b=sc.nextFloat();
res=a*b;
System.out.println("Area of Rectangle is:"+res);
}
}
public class Triangle extends Rectangle
{
public void area_t()
{
System.out.println("Enter the value of a:");
a=sc.nextFloat();
System.out.println("Enter the value of b:");
b=sc.nextFloat();
res=0.5f*a*b;
System.out.println("Area of Triangle is:"+res);
}
public static void main(String args[])
{
Triangle t=new Triangle();
t.area_c();
t.area_r();
t.area_t();
}
}
