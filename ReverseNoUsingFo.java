class   ReverseNoUsingFor
{
	public static void main(String[] args) 
	{
		for(int num=2345;num>0;num=num/10)
		{
			int  reverse=0;
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
				System.out.println(reverse);
	}
}
