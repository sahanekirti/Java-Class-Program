import java.util.Scanner;
class PalindromeArray 
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

		for(int i=0;i<a.length;i++)
		{
			if(isPalindrome(a[i]))
			{
				System.out.println(" palindrome no="+a[i]);
			}
	}
	}




	public static boolean isPalindrome(int num)
	{
              int  rev=0;
			int rem=num%10;
			rev=(rev*10)+rem;

			while(num>0)
		{
			if(rev==num)
				
				{
					return true;
				}
		
			num/=10;
		}
			return false;

	}
}
