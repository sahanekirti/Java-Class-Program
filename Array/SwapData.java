import java.util.Scanner;
class SwapData 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of an array ");
		int a[]=new int[sc.nextInt()];


		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}


System.out.println("enter the ele no for swapping");
			int temp=a[i];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;


			
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}



	}
}
