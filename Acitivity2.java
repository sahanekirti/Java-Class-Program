import java.util.Scanner;
class Acitivity2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);

if(ch>='a'||ch<='z')
{
System.out.println("alphabet");
}


else if(ch>='0'|| ch<='9')

{
 System.out.println("number");
}
else 
{
System.out.println("specail symbol");
}
}
}
 