import java.util.Scanner;

class FloatArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		float a[]=new int[sc.nextFloat()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextFloat();

		}
	}

}
