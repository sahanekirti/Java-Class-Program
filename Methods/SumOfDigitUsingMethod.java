import java.util.Scanner;

class SumOfDigitUsingMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number");
		int num=sc.nextInt();

sumOfDigit(num);
	}
	public static void sumOfDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			
			int rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		System.out.println(sum);
	}


}
