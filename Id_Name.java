import java.util.Scanner;
public class Idname
{
public static void main(String args[])
{
int Id=1;
String Name;
Scanner sc=new Scanner(System.in);
do
{
System.out.println("Enter the Id:");
Id=sc.nextInt();
System.out.println("Enter the Name:");
Name=sc.next();
System.out.println("Id:"+Id);
System.out.println("Name:"+Name);
System.out.println("Do you want to continue?(y/n)");
String ch=sc.next();
if(ch.startsWith("n"))
{
break;
}
}
while(true);
}
}
