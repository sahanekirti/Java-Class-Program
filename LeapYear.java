import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A year");
		int year =sc.nextInt();

		if((year%4==0 && year%100!=0) || (year%400==0))
		{

			System.out.println("it is leap year");
	}
	else
		{
		 System.out.println("Its not lepa year");
		}

	}
}
