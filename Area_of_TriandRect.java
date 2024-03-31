import java.util.Scanner;
public class AreaofTR
{
float b,h,res;
Scanner s1=new Scanner(System.in);
public void areaofT(float b,float h)
{
System.out.println("Enter the value of b:");
b=s1.nextFloat();
System.out.println("Enter the value of h:");
h=s1.nextFloat();
res=0.5*b*h;
System.out.println("Area of Triangle is:"+res);
}
public void areaofR(float a,float b)
{
System.out.println("Enter the value of a:");
a=s1.nextFloat();
System.out.println("Enter the value of b:");
b=s1.nextFloat();
res=a*b;
System.out.println("Area of Rectangle is:"+res);
}
public static void main(String args[])
{
AreaofTR a=new AreaofTR();
a.areaofT(10,20);
a.areaofR(10,20);
}
}
