import java.util.Scanner;
class VowlesArray 
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
		
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				System.out.println("vowels:"+ch[i]);
		}
	}
}
