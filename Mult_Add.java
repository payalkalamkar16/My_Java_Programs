import java.util.Scanner;
class Addition
{
int a,b,res;
Scanner sc= new Scanner(System.in);
public void ope(int a, int b)
{
System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a+b;
System.out.println("Addition is:"+res);
}
}
public class Multipli extends Addition
{
public void ope(int a, int b)
{
System.out.println("Enter the value for a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a*b;
System.out.println("Multiplication is:"+res);
}
public static void main(String args[])
{
Addition a;
a= new Addition();
a.ope(10,20);
a=new Multipli();
a.ope(10,20);
}
}
