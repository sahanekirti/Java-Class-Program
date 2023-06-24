class   SecondMaxValue
{
	public static void main(String[] args) 
	{
		int a[]={6,9,2,3,6,8,13,45,-8,2};
		int max=Integer.MIN_VALUE;
		int secmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
	
			
			
				if(a[i]>secmax && a[i]!=max)
				{
					secmax=a[i];
				}
			}

					System.out.println(max);
					System.out.println(secmax);
	}
}

