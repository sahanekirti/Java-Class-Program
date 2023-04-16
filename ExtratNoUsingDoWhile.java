class ExtratNoUsingDoWhile 
{
	public static void main(String[] args) 
	{
		int num=1234;
		do
		{
			int rem=num %10;
			System.out.println(rem);
			num=num/10;
				}
		while (num>0);
	}
}
