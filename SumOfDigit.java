import  java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
           Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		   
		   int product=1;
		   while(num!=0)
		{
			   int rem=num%10;
			    product=product*rem;
				num/=10;

	}
	   System.out.println(product);
}
}