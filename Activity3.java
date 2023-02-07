import java.util.Scanner;
class Activity3
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();

if(a>=b&&a>=c){

System.out.println(a+" is largest no");
}
 else if(b>=a&&b>=c){
System.out.println(b+" is the largset no");
}
else{
 System.out.println(c+ "is the largest no");
}
}
}
