package string2;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a data");
		String s=sc.nextLine();
		
		
		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}
