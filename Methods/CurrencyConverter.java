import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amout in reupee");
		double inr=sc.nextDouble();

		rupeeToDollar(inr);
	}
	public static void rupeeToDollar(double rupee)
	{
		double dollar=rupee/82.31;
		int temp=(int)(dollar*100);
		System.out.println(temp/100.0);
		dollarToEuro(temp/100.0);
	}

	public static void dollarToEuro(double dollar)
	{
		double euro=dollar/0.92;
		int temp=(int)(euro*100);
		System.out.println(temp/100.0);
		euroToDhiram(temp/100.0);
	}

	public static void euroToDhiram(double euro)
	{
		double dhiram=euro*3.98;
		int temp=(int)(dhiram*100);
		System.out.println(temp/100.0);
		dhiramToPound(temp/100.0);
	}

	public static void dhiramToPound(double dhiram)
	{
		double pound=dhiram*0.22;
		int temp=(int)(pound*100);
		System.out.println(temp/100.0);
	}

	}

