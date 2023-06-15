import java.util.Scanner;
class BouncyArray 
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
			if(isBouncy(a[i]))
			{
				System.out.println(" bouncy no="+a[i]);
			}
	}
	}





	public static boolean isBouncy(int num)
	{
		boolean inc=false,dec=false;
		while(num!=0)
		{
			int n1=num%10;
			num/=10;

			int n2=num%10;
			if(num==0)
			{
				break;
			}
			if(n1>n2)
			{
				dec=true;
			}
			else if(n1<n2)
			{
				inc =true;
			}
			if(inc==true&&dec==true)
			{
				return true;
				}
		}
					return false;
			}
		
	}




