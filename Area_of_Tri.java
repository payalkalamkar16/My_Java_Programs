import java.util.Scanner;
public class AreaofT
{
public static void main(String args[])
{
float b,h,res;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value of b:");
b=s1.nextFloat();
System.out.println("Enter the value of h:");
h=s1.nextFloat();
res=0.5f*b*h;
System.out.println("Area of Triangle is:"+res);
} 
}
