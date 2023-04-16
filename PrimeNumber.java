class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num=5;
		int dem=2;
		while(dem<num)
		{
			if(num%dem==0)
			{
				break;
			}
			dem++;
		}
		if(num==dem)
		{

		System.out.println("It is prime number");
	}
	else{
		System.out.println("its not prime number");
	}
	}
}
