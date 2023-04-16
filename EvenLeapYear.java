//range of laep year between given year(starting year and ending point)

import java.util.Scanner;
class  EvenLeapYear

{
	public static void main(String[] args) 
	{
		int  year=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Starting Year");
		  int start=sc.nextInt();

		  System.out.println("Enter Ending Point");
		  int end=sc.nextInt();


     if(year%2==0)
//for(int  year =start;year<=end;year++)

		{
				if((year%4==0 && year%100!=0) || (year%400==0))

{
			//	if(year%2==0)
			//	{
					System.out.println(year);
			}
			
		}
	}
}
