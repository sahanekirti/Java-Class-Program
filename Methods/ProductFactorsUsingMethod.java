class ProductFactorsUsingMethod 
{
	public static void main(String[] args) 
	{
		factor(15);
	}
	public static void factor(int num)
	{
		int dem=1;
		int product=1;
		while (dem<=num)
		{
			if(num%dem==0)
			{
				product=product+dem;
				
				
			}
			dem++;
		}
		System.out.println(product);
}
}




