import java.util.Scanner;
class SumOfArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[sc.nextInt()];

		for(int i=0;i<a.length;i++)
		{
             a[i]=sc.nextInt();
		}

		int sum=0;
		int num=0;
		for(int i=0;i<a.length;i++)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
			
		}
		if(sum%2==0)
		{
			System.out.print(true);
		}
			else
		{
				System.out.print(false);
	
		}
	}
}