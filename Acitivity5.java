import java.util.Scanner;
class Acitivity5
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("menu");
System.out.println("1.add");
System.out.println("2.sub");
System.out.println("3.mult");
System.out.println("4.div");

switch(sc.nextInt())
{
case 1:
  System.out.println("enter two number");
  System.out.println(sc.nextInt()+sc.nextInt());
  break;

case 2:
  System.out.println("enter two number");
  System.out.println(sc.nextInt()-sc.nextInt());
  break;

case 3:
  System.out.println("enter two number");
  System.out.println(sc.nextInt()*sc.nextInt());
  break;

case 4:
  System.out.println("enter two number");
  System.out.println(sc.nextInt()%sc.nextInt());
  break;




}




}
}
