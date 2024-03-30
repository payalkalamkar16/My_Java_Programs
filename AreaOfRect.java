import java.util.Scanner;
public class AreaofR
{
int l,b,res;
Scanner s1=new Scanner(System.in);
public void areaofR(int b,int h)
{
System.out.println("Enter the value of l:");
l=s1.nextInt();
System.out.println("Enter the value of b:");
b=s1.nextInt();
res=l*b;
System.out.println("Area of Rectangle is:"+res);
}
public static void main(String args[])
{
AreaofR a=new AreaofR();
a.areaofR(10,20);
}
}
