class SumOfSumFactors 
{
	public static void main(String[] args) 
	{
		int num=18;
		int dem=1;
		int sum=0;

		while (dem<=num)
		{
			if(num%dem==0)
			{
				sum=sum+dem;
			}
			dem++;
		}
		System.out.println(sum);
	}
}
