import java.util.Scanner;
public class ArithOperation
{
public static void main(String args[])
{
int a,b,res,ch;
Scanner sc=new Scanner(System.in);
System.out.println("Choose the option:\n 1:Find Addition \n 2: Find Multiplication \n 3:Find Substraction \n 4: Find Division");

System.out.println("Enter your choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a+b;
System.out.println("Addition is:"+res);
break;
case 2:System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a*b;
System.out.println("Multiplication is:"+res);
break;
case 3:System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a-b;
System.out.println("Subtraction is:"+res);
break;
case 4:System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
res=a/b;
System.out.println("Division is:"+res);
break;
default:System.out.println("Sorry! Invalid option");
}
}
}
