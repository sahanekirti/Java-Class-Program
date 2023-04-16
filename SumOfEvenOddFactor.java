class SumOfEvenOddFactor 
{
	public static void main(String[] args) 
	{
		int num=10;
		int dem=1;
		int evensum=0;
		int oddsum=0;


		while (dem<=num)

		{
			if(num%dem==0)
			{
				if (dem%2==0)
				{
					evensum=evensum+dem;
				}
				else
				{
					oddsum=oddsum+dem;

		}
			}
			dem++;
		}
		System.out.println("evensum:"+evensum);
		System.out.println("oddsum:"+oddsum);
	}
}
