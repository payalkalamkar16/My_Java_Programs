import java.util.Scanner;
public class AreaofT
{
float b,h,res;
Scanner s1=new Scanner(System.in);
public void areaofT(float b,float h)
{
System.out.println("Enter the value of b:");
b=s1.nextFloat();
System.out.println("Enter the value of h:");
h=s1.nextFloat();
res=0.5f*b*h;
System.out.println("Area of Triangle is:"+res);
}
public static void main(String args[])
{
AreaofT a=new AreaofT();
a.areaofT(10,20);
}
}
