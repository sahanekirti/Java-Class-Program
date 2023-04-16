import java.util.Scanner;

class SumOfEvenOddUsingMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();

             sumEvenOdd(num);
	}
	public static void sumEvenOdd(int n)
	{
		
		int evensum=0;
		int oddsum=0;

		while (n!=0)
		{
			int rem=n%10;
			if (rem%2==0)
			{
				evensum=evensum+rem;
			}
			else
			{
				oddsum=oddsum+rem;

			}
		}
           System.out.println("evensum:"+evensum);
		   System.out.println("oddsum:"+oddsum);
	}
}
