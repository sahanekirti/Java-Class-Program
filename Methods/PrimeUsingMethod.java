
class  PrimeUsingMethod
{
	public static void main(String[] args) 
	{
		primeNo(6);
	}

	public static void primeNo(int num)
	{
  // int num=5;
   int dem=2;
   while (dem<num)
   {
	   if (num%dem==0)
	   {
		   break;
	   }
	   dem++;

   }
   if(num==dem)
		{
	   System.out.println("its prime number");
		}
		else
		{
			System.out.println("its not prime number");
		}
}
}
