class EvenOddFactorsUsingMethod 
{
	public static void main(String[] args) 
	{
		evenOddFactor(12);
	}
	public static void evenOddFactor(int num)
	{
		int dem=1;
		while (dem<=num)
		{
			if(num%dem==0)
			{
			if(dem%2==0)
			{
				System.out.println("evenfactor:"+dem);
				}
				else
			{
					System.out.println("odd factor:"+dem);
			}
		}
			dem++;
		}
}
}

