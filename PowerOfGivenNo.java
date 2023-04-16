import java.util.Scanner;
class PowerOfGivenNo

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a base value");
		 int base=sc.nextInt();


            System.out.println("Enter a raise value");
			int raise=sc.nextInt();

			int ans=1;
			while (raise>0)
			{
				ans=ans*base;
				raise--;
			}
			System.out.println(ans);

	}
}
