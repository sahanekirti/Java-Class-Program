import  java.util.Scanner;
class SumOfEvenOddDigit
{
	public static void main(String[] args) 
	{
           Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		   
		   int evensum=0;
		   int oddsum=0;
		   
		   while(num!=0)
		{

			   int rem=num%10;
			//    product=product*rem;

				if(rem%2==0)
			{
				evensum=evensum+rem;	 
			}
			else
				{
                       oddsum=oddsum+rem;
			}
				num/=10;

	}
	   System.out.println("sum of even  number" +evensum);
	   System.out.println("Suem of odd number"+oddsum);
}
}