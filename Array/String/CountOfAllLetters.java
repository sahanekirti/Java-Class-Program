package assignment;
 import java.util.Scanner;
public class CountOfAllLetters {
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String  s1=sc.next();
		char []ch=s1.toCharArray();
		
		int  upperc=0;
		int lowerc=0;
		int numberc=0;
		int symbolc=0;
		
	
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				upperc++;
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				lowerc++;
				
			}
			
			else if(ch[i]>='0'&&ch[i]<='9')
			{
				numberc++;
				
			}
			else
			{
				symbolc++;
				
			}
			
		}
		System.out.println("uppercase count:"+upperc);
		System.out.println("lowercase count:"+lowerc);
		System.out.println("number count:"+numberc);
		System.out.println("symbol  count:"+symbolc);
		
		
		
	}
}
