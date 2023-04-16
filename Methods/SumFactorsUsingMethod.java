class SumFactorsUsingMethod 
{
	public static void main(String[] args) 
	{
		factor(15);
	}
	public static void factor(int num)
	{
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




