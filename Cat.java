public class Cat
{
int age;
public void setage(int age)
{
this.age=age;
}
public int getage()
{
return age;
}
public static void main(String args[])
{
Cat c=new Cat();
c.setage(5);
System.out.println("Cat's age is "+c.getage()+" years");
}
}
