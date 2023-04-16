class   ReverseNoUsingFor
{
	public static void main(String[] args) 
	{
		
			
		for( int num=1234; num>0;  num=num/10)
		{
		
			int  rem=num%10;
			int  reverse=0;
			reverse=(reverse*10)+rem;
			
				System.out.println(reverse);
	}
}
}