class ReverseUsingMethod 
{
	public static void main(String[] args) 
	{
		reverse(2345);
	}

	public static  void reverse(int num)
	{
		for(num=2345; num>0 ; num=num/10)
		{
			int rem=num%10;
			int rev=0;
			rev=(rev*10)+rem;
			System.out.println(rev);
		}
	
}
}
