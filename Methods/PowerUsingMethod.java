class PowerUsingMethod 
{
	
	public static void main(String[] args) 
	{
		power(3,5);
	}
	public static void power(int raise,int base)
	{
		int pow=1;
		for(int i=0;i<raise;i++)
		{
			pow*=base;
}
System.out.println(pow);
	}
}
