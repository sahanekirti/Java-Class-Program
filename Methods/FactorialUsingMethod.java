import java.util.Scanner;
class FactorialUsingMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number");
		int num=sc.nextInt();
		facto(num);
	}

		public static void facto(int n)
		{
             int fact=1;
			 while(n>0)
			{
				 fact=fact*n;
				 n--;
				 }
				 System.out.println(fact);
		}
	
}
