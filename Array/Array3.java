import java.util.Scanner;
class Array3 
{
	public static strictfp final synchronized  void  main(String[]  args) 

		//static public void main(String... hello)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[sc.nextInt()];

		for(int i=0;i<a.length;i++)
		{
             a[i]=sc.nextInt();
		}

		int sum=0;
		int count=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
		
				sum+=a[i];
			count++;
		}
		System.out.println("sum of positive number:"+sum);
		System.out.println("count of positive number:"+count);
	}
}
