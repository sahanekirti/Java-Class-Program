import java.util.Scanner;
class RangeLeapYearUsingMethod 
{
  public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a starting year");
		int start=sc.nextInt();

		System.out.println("enter a ending year");
		int end=sc.nextInt();
		 
		for(int year =start; year<=end; year++)
		{
			if(checkLeapYear(year))
			{
				System.out.println(year);
			}
	}
	}

	public static boolean checkLeapYear(int year)
	{

	if((year%4==0&& year%100!=0)||(year%400==0))
		{
		return true;
		}
			return false;
		}
}
	
