class FcatorialNumber 
{
	public static void main(String[] args) 
	{
		int num=10;
		int dem=1;

		while(dem<=num)
		{
			if(num%dem==0)
			{
				if(dem%2==0)
				{
				
				System.out.println("evenfactorail:"+dem);
				}
					else
					{
						System.out.println("odd factorail:"+dem);
					}
	}
	dem++;
}
	}
}
