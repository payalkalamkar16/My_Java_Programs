public class Operation
{
public void add()
{
int a=5,b=6,c;
c=a+b;
System.out.println("Sum is:"+c);
}
public void mul()
{
int a=8,b=9,c;
c=a*b;
System.out.println("Mult is:"+c);
}
public static void main(String args[])
{
Operation a1=new Operation();
a1.add();
a1.mul();
}
}



