import java.util.Scanner;
class Activity4
{
public static void main(String[] args)
{
System.out.println("enter year");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
 if(a%4==0){
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}
}