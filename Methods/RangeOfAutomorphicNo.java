import java.util.Scanner;
class   RangeOfAutomorphicNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	   
		System.out.println("Enter a start number");
		int  start=sc.nextInt();
		System.out.println("enter a ending no");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++)
		{
		if(isAutomorphicNo(n))
		{
			System.out.println(i);
		}
}
	}
public static boolean isAutomorphicNo(int num)
	{ 
	
		 int sq=num*num;
		 while(num!=0)
		{
			 if(num%10!=sq%10)
			{
				 return false;
			}
			num/=10;
			sq/=10;
		}
		return true;
	}
}
