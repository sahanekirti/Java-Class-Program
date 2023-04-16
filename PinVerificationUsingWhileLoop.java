import java.util.Scanner;
class PinVerificationUsingWhileLoop

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int attempt =0;
		int actualpin=1234;

		while(attempt<3)
		{
			System.out.println("Enter your pin");
			int pin=sc.nextInt();

			if(pin==actualpin)
			{
				System.out.println("login Successful");
				break;
			}

		System.out.println("incorrect password");
		attempt++;
	}
	             if(attempt<3)
		{
		System.out.println("Maximun attempt reached");
}
	}
}