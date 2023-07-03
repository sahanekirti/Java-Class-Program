package assignment;

import java.util.Scanner;

public class LastUnique {

				public static void main(String[] args) 
				{
					Scanner sc=new Scanner(System.in);
			
					System.out.println("enter string");
					String  a=sc.next();
					char []ch=a.toCharArray();
					

			
					for(int i=0;i<a.length();i--)
					{
					int	count=0;
						if(ch[i]!='\u0000')
						{
							for(int j=i+1;j<a.length();j++)
							{
								if(ch[i]==ch[j])
								{
									count++;
									ch[j]='\u0000';
								}
							}
							if(count==0)
							{
								System.out.println(ch[i]+" ");
//								return;
							}
						}
					}
				}
			}

			







