import java.util.Scanner;
class PerfectNoArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[sc.nextInt()];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	}

		for(int i=0;i<a.length;i++)
		{
			if(isPerfect(a[i]))
			{
				System.out.println(" perfect no="+a[i]);
			}
	}
	}



public static boolean isPerfect(int num)
	{
	  int den=1;
	  int sum=0;
	  while(den<=num/2)
		{
		  if(num%den==0)
			{
			  sum=sum+den;
			}
			den++;
		}

		if(num==sum)
		{
			return true;
		}
		else
		{
		return false; 
		}
		}
}
