import java.util.Scanner;
class PinVerificationUsingForLoop

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int attempt =0;
		int actualpin=1234;

		for( attempt=0;attempt<3;attempt++)
		{
			System.out.println("Enter your pin");
			int pin=sc.nextInt();

			if(pin==actualpin)
			{
				System.out.println("login Successful");
				break;
			}

		System.out.println("incorrect password");
	}
	             if(attempt<3)
		{
		System.out.println("Maximun attempt reached");
}
	}
}