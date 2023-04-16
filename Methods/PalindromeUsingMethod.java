class PalindromeUsingMethod 
{

	public static void main(String[] args) 
	{
		palindrome(121);
	}



	public static void palindrome(int num)
	{
            int rev=0;
			for (int i=num;i>0 ;i/=10 )

			{
				int rem=i%10;
				rev=(rev*10)+rem;

			}
			if(num==rev)
		{
				System.out.println("its palindrom number");
		}
		else
		{
			System.out.println("its not palindrome number");
		}



	
}

}
