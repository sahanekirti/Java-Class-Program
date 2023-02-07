import java.util.Scanner;

class ControlStmtIf{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 
 int temp=a%10;
if(a%2==0)
{ 
System.out.println(temp*temp);
System.exit(0);
}
 System.out.println(temp*temp*temp);
}
}