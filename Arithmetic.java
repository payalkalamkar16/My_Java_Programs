public class Arithmetic
{
public void add()
{
int a=6,b=14,c;
c=a+b;
System.out.println("Addition is:"+c);
}
public void sub()
{
int a=9,b=16,c;
c=b-a;
System.out.println("Subtraction is:"+c);
}
public void mult()
{
int a=12,b=4,c;
c=a*b;
System.out.println("Multipication is:"+c);
}
public void div()
{
int a=18,b=3,c;
c=a/b;
System.out.println("Division is:"+c);
}
public static void main(String args[])
{
Arithmetic a1=new Arithmetic();
a1.add();
a1.sub();
a1.mult();
a1.div();
}
}




