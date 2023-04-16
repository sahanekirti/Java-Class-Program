class EvenOddFactors 
{
	public static void main(String[] args) 
	{
		int num=20;
		int dem=1;
		while (dem<=num)
		{
			if(num%dem==0)
			{
				if(dem%2==0)
				{
					System.out.println("even factor"+dem);

		}
		else
				{
		System.out.println("odd factor"+dem);
				}
	}
	dem++;
		
		}
	}
}
