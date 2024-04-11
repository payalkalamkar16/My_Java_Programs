import java.util.Scanner;
public class SCRoots
{
int a,b;
Scanner s1=new Scanner(System.in);
public void sqr()
{
System.out.println("Enter a value:");
a=s1.nextInt();
b=a*a;
System.out.println("Square is:"+b);
}
public void cube()
{
System.out.println("Enter a value:");
a=s1.nextInt();
b=a*a*a;
System.out.println("Cube is:"+b);
}
public static void main(String args[])
{
SCRoots a=new SCRoots();
a.sqr();
a.cube();
}
}
