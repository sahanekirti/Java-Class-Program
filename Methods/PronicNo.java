import java.util.Scanner;
class PronicNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number");
		int num=sc.nextInt();

		if(isPronicNo)
		{
			System.out.println("its pronic no");
		}
			else
		{
				System.out.println("ists not pronic no");
		}

	}
	public static boolean isPronic(int num)
	{
		int  n1=1;
		int n2=2;
		while(true)
		{
			int ans=n1*n2;
			if(ans==num)
			{
				return true;
			}
			break ;
		}
			else if(ans>num)
		{
				return false;
		}
				break;
		}
	n1=n2;
		n2++;
	}


