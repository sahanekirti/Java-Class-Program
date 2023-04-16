import java.util.Scanner;

class ProductOfEvenOddUsingMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();

             productEvenOdd(num);
	}
	public static void productEvenOdd(int n)
	{
		
		int evenproduct=1;
		int oddproduct=1;

		while (n!=0)
		{
			int rem=n%10;
			if (rem%2==0)
			{
				evenproduct=evenproduct*rem;
			}
			else
			{
				oddproduct=oddproduct*rem;

			}
		}
           System.out.println("evenproduct:"+evenproduct);
		   System.out.println("oddproduct:"+oddproduct);
	}
}
