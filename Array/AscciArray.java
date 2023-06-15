import java.util.Scanner;
class AscciArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		

		System.out.println("enter size");
		int size=sc.nextInt();
		char ch[]=new char[size];

		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}

		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i];
			System.out.println("asscii value:"+a);
		
	
		
		}
	}
}
