import java.util.Scanner;

class ControlStmtIf2{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
 char ch=sc.next().charAt(0);
 if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
{
 
System.out.println("vowels");
System.exit(0);
}
 System.out.println("consonents");
}
}