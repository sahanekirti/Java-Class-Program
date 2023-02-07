import java.util.Scanner;
class SwitchStmt3{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("***********enter your String:**********");
//switch(sc.next()) another way
 String choice=sc.nextLine();
 switch(choice)

{
   case "monday":
    System.out.println("~~~~office~~~~~~~");
  break;

  case "tuesday":
    System.out.println("----> work from home <------");
  break;			

  case "wednesday":
    System.out.println("!!!!!!!! presentation !!!!!!!!!!!");
  break;

  case  "thrusday":
    System.out.println("??????? travel ????????? ");
  break;

case "friday":
    System.out.println("$$$$$$ sport  $$$$$$");
  break;

  case "saturday":
    System.out.println("****** movie *******");
  break;
  
  case "sunday":
    System.out.println("____________sleepy day________________");
  break;

  

default:
System.out.println("enter correct choice");
}
}
}