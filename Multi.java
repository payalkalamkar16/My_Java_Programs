import java.util.Scanner;
class Addition
{
int a,b,res;
Scanner sc= new Scanner(System.in);
public void add()
{
System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a+b;
System.out.println("Addition is:"+res);
}
}
public class Multi extends Addition
{
public void mult()
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
Multi m=new Multi();
m.add();
m.mult();
}
}
