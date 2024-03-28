import java.util.Scanner;
public class Student
{
int Roll_no;
String Name;
Scanner sc=new Scanner(System.in);
public void setRoll_no(int Roll_no)
{
System.out.println("Enter the Roll_no:");
Roll_no=sc.nextInt();
this.Roll_no=Roll_no;
}
public int getRoll_no()
{
return Roll_no;
}
public void setName(String Name)
{
System.out.println("Enter the Name:");
Name=sc.next();
this.Name=Name;
}
public String getName()
{
return Name;
}
public static void main(String args[])
{
Student s=new Student();
s.setRoll_no(0);
s.setName(null);
System.out.println("Roll No:"+s.getRoll_no());
System.out.println("Name:"+s.getName());
}
}
