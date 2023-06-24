import java.util.Scanner;
class StrongNoArray 
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
			if(isStrong(a[i]))
			{
				System.out.println(" strong no="+a[i]);
			}
	}
	}


	public static boolean isStrong(int num)
	{
		  int temp=num;
		  int sum=0;
		  int prod=1;
		  while(temp>0)
		{
			  int rem=temp%10;
			  for(int i=rem;i>0;i++)
			{
				  prod*=i;
			}
			sum+=prod;
			temp/=10;
		}
		if(sum==num)
		{
			return true;
		}
		else
		{

			return false;
		}
	}
}

				
		

