import  java.util.Scanner;
class ProductOfEvenOddDigit
{
	public static void main(String[] args) 
	{
           Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		   
		   int   evenproduct=1;
		   int oddproduct=1;
		   
		   while(num!=0)
		{

			   int rem=num%10;
			//    product=product*rem;

				if(rem%2==0)
			{
				evenproduct=evenproduct*rem;	 
			}
			else
				{
                       oddproduct=oddproduct*rem;
			}
				num/=10;

	}
	   System.out.println("product of even  number: " +evenproduct);
	   System.out.println("product  of odd number:  "+oddproduct);
}
}