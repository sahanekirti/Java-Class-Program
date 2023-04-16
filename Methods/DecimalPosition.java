import java.util.Scanner;
class DecimalPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the value");
		double ip=sc.nextDouble();
		cutDecimal(ip,2);

	}
	public static void cutDecimal(double num,int count)
	{
		double x=1;
		for(int i=0;i<count;i++)
		{
			x=x*10;
		}
		int temp=(int)(num*x);
		System.out.println(temp/x);
	}
}
