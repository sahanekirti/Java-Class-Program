package assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.next();
		char[] ch=s.toCharArray();
		
		
	String rev="";
	for(int i=ch.length-1;i>=0;i--)
	{
		rev+=ch[i];
	}
	System.out.println(rev);
		
	}

}
