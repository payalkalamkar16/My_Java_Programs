import java.util.Scanner;
public class Table
{
public static void main(String args[])
{
int i=1,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
System.out.println("Table is:");
while(i<=10)
{
System.out.println(n+"*"+i+"="+i*n);
i++;
}
}
}
