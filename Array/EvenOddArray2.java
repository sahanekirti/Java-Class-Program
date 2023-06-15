import java.util.Scanner;
class EvenOddArray2
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
		for(int i=0;i<a.length;i++)
		{
          if(a[i]%2==0)
			
			  System.out.println(a[i]+" ");
					}

			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==1)
				
					System.out.print(a[i]+" ");
				
			}

}
}