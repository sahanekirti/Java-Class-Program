import  java.util.Scanner;
class CheckPrimePalindrome
	{
		public static  boolean checkPrime(int num)
		{
			 int c=0;
			 for(int j=1;j<=num;j++)
			{
				 if(num%j==0)
				{
					 c++;
				}
			}
			if(c==2)
			{
					 return true;
				}
				return false;
			}

	public static  boolean checkPalindrome(int num)
	
	{
		int rev=0;
		int temp=num;
		while(temp>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		if(temp==rev)
		{
			return true;
		}
		return false;
	}
		public static void main(String[] args)
		{
			Scanner sd=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sd.nextInt();
		for(int num=a;num<=a;num++)
			{
			if(checkPrime(num) && checkPalindrome(num))
				{
				System.out.println(num);
	}
}
		}
	}