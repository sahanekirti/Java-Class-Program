package assignment;
import java.util.Scanner;

public class AnagramString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter first string");
		String s1=sc.next();

		System.out.println("enter second string");
		String s2=sc.next();
		 
		char[] ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();;
		
		int count=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=0;j<ch2.length;j++)
				{
					if(ch1[i]==ch2[i])
					{
						count++;
						ch2[j]='\u0000';
					}
				}
			}
			if(count==ch1.length)
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
		}
		else
		{
			System.out.println("not anagram");
		}
		
	}


}
