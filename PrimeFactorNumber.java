class PrimeFactorNumber 
{
	public static void main(String[] args) 
	{
		int num=10;
		int dem=1;
		


		while (dem<num)

		{
			if(num%dem==0)
			{
	          break;
			}
			if(num==dem)
			{
				System.out.println("it is prime");
			}
			if(dem%2==0)
			{

			System.out.println("even factor:"+dem);
			}
				else
				{
					System.out.println("odd factor:"+dem);

		}
			
			dem++;
		}
	
		else
		{

		System.out.println("not prime number");
		
	}
}
}
