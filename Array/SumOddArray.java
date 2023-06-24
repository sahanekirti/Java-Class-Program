import java.util.Scanner;
class SumOddArray
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
      int sum=0;
		

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				sum+=a[i];
			//	System.out.println(a[i]);
			
		}
		
		System.out.println("odd sum from array:"+sum);
		
	}
}
