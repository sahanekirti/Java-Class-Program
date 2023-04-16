import java.util.Scanner;
  class HotelMenu
{
 public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
   System.out.println("******Welcome******");
   System.out.println("-----choose your manu------");
   System.out.println("1.veg");
    System.out.println("2.non veg");
   
    int menu=sc.nextInt();
   
   switch(menu)
{
  case 1:
   System.out.println("1.panner---->120");
   System.out.println("2.paratha");
   System.out.println("3.puri bhaji");

   System.out.println("******choose your veg order*****");
   int order=sc.nextInt();
  
  switch(order)
{
    
   case 1:
   System.out.println("the price of hailf plate");
    break;
   
   case 2:
   System.out.println("pay 80 for paratha");
    break;
   
     case 3:
   System.out.println("pay 50 for puri bhji");
    break;
}

   break;
}


}
}
   