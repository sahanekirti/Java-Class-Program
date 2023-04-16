import java.util.Scanner;
class   AutomorphicNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a number");
		int  num=sc.nextInt();
		if(isAutomorphicNo(num))
		{
			System.out.println("is automorphic no");
		}
		else
		{
			System.out.println("its not automorphic number");

	}
}
public static boolean isAutomorphicNo(int num)
	{
		 int sq=num*num;
		 while(num!=0)
		{
			 if(num%10!=sq%10)
			{
				 return false;
			}
			num/=10;
			sq/=10;
		}
		return true;
	}
}
