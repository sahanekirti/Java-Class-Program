package assignment;

import java.util.Scanner;

public class PrimeNoArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a no");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0)
				{
					isPrime=false;
//					break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
