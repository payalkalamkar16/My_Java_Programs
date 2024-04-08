import java.util.Scanner;
public class Information
{
int Roll_no;
String Name,City,State;
Scanner sc=new Scanner(System.in);
public void info()
{
int i=1;
do
{
System.out.println("Enter the Roll_no:");
Roll_no=sc.nextInt();
System.out.println("Enter the Name:");
Name=sc.next();
System.out.println("Enter the City:");
City=sc.next();
System.out.println("Enter the State:");
State=sc.next();
System.out.println("Roll_no:"+Roll_no);
System.out.println("Name:"+Name);
System.out.println("City:"+City);
System.out.println("State:"+State);
}
while(i<=5);
}
public static void main(String args[])
{
Information a=new Information();
a.info();
}
}
