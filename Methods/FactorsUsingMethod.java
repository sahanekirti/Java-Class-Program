class FactorsUsingMethod 
{
	public static void main(String[] args) 
	{
		factor(15);
	}
	public static void factor(int num)
	{
		int dem=1;
		while (dem<=num)
		{
			if(num%dem==0)
			{
				System.out.println(dem);
			}
			dem++;
		}
}
}
