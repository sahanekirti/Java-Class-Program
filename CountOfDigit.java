import java.util.Scanner;
class CountOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;

		for (int i=n; i>0;i/=10 )

		{
			int a=i%10;
			count++;
		}
		   System.out.println(count);
	}
}
