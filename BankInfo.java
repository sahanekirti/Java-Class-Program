import java.util.Scanner;
class BankInfo{
 public static void main(String[] args)
{
  String name="raja";
  int accno=1234;
  int pswd=222;
  double balance=2000;
  Scanner sc=new Scanner(System.in);
System.out.println("Enter Accountno");

  if(accno==sc.nextInt())
{
  System.out.println("enter password");
  if(pswd==sc.nextInt())
{

System.out.println("enter amount");
double money=sc.nextDouble();
if(balance<=money)
{
 balance=balance-money;
 System.out.println("collect amount "+(char)2);

}
else
{
System.out.println("insufficient balance");
}
}
else
{
 System.out.println("enter  correct password");
}
}
else
{
System.out.println("invalid accno");


}
}
}