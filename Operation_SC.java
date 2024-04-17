import java.util.Scanner;
public class OperationSC 
{
int a;
double b;
Scanner sc=new Scanner(System.in);
public OperationSC(int a)
{
this.a=a;
System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Square is:"+a*a);
}
public OperationSC(double b)
{
this.b=b;
System.out.println("Enter the value of b:");
b=sc.nextDouble();
System.out.println("Cube is:"+b*b*b);
}
public static void main(String args[])
{
new OperationSC(5);
new OperationSC(5d);
}
}
