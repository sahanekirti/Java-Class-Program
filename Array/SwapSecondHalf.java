import java.util.Scanner;
class SwapSecondHalf

{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int a[]=new int[sc.nextInt()];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		 
		 //for(int i=0;i<(a.length/2)-1;i+=5)
		{
			 int temp=a[i];
			 a[i]=a[i+1];
			 a[i+1]=temp;
		}

		 
		 for(int i=0;i<a.length;i++)
		{
			 System.out.print(a[i]+" ");
		}
	}
}

