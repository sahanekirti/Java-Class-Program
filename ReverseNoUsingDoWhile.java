class   ReverseNoUsingDoWhile
{
	public static void main(String[] args) 
	{
		
			
		int num=1234;
		do
		{
               int  rem=num%10;
			int  reverse=0;
			reverse=(reverse*10)+rem;
			num=num/10;
			System.out.println(reverse);
		}
		
	while(	num>0);  
		
		
			
				
	
}
}