package assignment;

import java.util.Scanner;

public class PrintVowels 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String  s1=sc.next();
		char []ch=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				System.out.println(s1.charAt(i));
			}
				
				
				}
	}
	
}
