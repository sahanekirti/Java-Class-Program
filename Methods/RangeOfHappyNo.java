import java.util.Scanner;

class  RangeOfHappyNo
{
	public static int isHappy(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=(rem*rem);
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start number");
		int start=sc.nextInt();

		System.out.println("enter a ending number");
		int end=sc.nextInt();

     	while(start<=end)
		{
			int ip=start;
			{
				while(true)
				{
					ip=isHappy(ip);
			if(ip==1||ip==4)
			{
				break;
				}
				}

		if(ip==1)
				{
		System.out.println(start);
			}
			start++;
		}

	}
		}
}


