package string2;

public class StringMethod {

	public static void main(String[] args) {
	
		
		
		
		
		
	System.out.println(ch[i]+" ");
	
	System.out.println(s1.toUpperCase());
	}
	}
	
	public static char[] toCharArray(String s1)
	{
		char []ch=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		return ch;
	}
	
	public static int length(String s1)
	{
		char[] ch=toChaArray(s1)
				return ch.length;
		}
	
	public static String toUpperCase(String s1)
	{
		String s2="";
		char ch[]=toCharArray(s1);
		for(int i=0;i<ch.length;i++)
		{
			char c1=ch[i];
			if(c1>='a'&&c1<='z')
			{
				char c2=(char)(c1-32);
				s1=s1+c2;
			}
			else
			{
				s2=s2+c1;
			}
			
		}
		return s2;
		
		
	}
	

	public static String toLowerCase(String s1)
	{
		String s2="";
		char ch[]=toCharArray(s1);
		for(int i=0;i<ch.length;i++)
		{
			char c1=ch[i];
			if(c1>='A'&&c1<='Z')
			{
				char c2=(char)(c1+32);
				
				s1=s1+c2;
			}
			else
			{
				s2=s2+c1;
			}
			
		}
		return s2;
		
		
	}
	
	
	
	
	
	
}
