class EvenOddCountFacatorialNumber 
{
	public static void main(String[] args) 
	{
		int num=10;
		int dem=1;
		int evencount=0;
		int oddcount=0;

		while(dem<=num)
		{
			if(num%dem==0)
			{
				if(dem%2==0)
				{
				evencount++;
				
				}
					else
					{
						oddcount++;
					
					}
	}
	dem++;
}
System.out.println("evencount:"+evencount);
	System.out.println("odd count:"+oddcount);
	}
}
