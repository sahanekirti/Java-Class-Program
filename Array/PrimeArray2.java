import java.util.Scanner;
 public class PrimeArray2

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int num[]=new int[sc.nextInt()];

		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
	}

		for(int i=0;i<num.length;i++)
		{
			if(isPrime(num[i]))
			{
				System.out.println("prime no="+num[i]);
			}
	}
	}

	public static boolean isPrime(int num)
	{
		int dem=2;
		while(num>dem)
		{
			if(num%dem==0)
			{
				break;
			}dem++;
		}
		if(num==dem)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}