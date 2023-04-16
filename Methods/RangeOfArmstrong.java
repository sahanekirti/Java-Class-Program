import java.util.Scanner;
class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{	Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");			
		int start = s.nextInt();

		System.out.println("Enter Starting Number : ");        
		int end = s.nextInt();	

		while (start<=end)
		{
			int sum = 0;                         
			int temp = start;
			int num = start;
			int count = 0;

			while (temp>0)		
			{
				count++;
				temp = temp/10;
			}

			while (num>0)						
			{
				int rem = num%10;				

				int pow = 1;
				for (int i=0;i<count ;i++ )
				{
					pow = pow * rem;		
				}
				
				sum += pow;
				num = num/10;
			}

			if (sum==start)						
			{
				System.out.println(sum);
			}

			start++;
		}
	}
}
