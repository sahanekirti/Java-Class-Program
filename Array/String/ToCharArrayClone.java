package string;

public class ToCharArrayClone {
	public static char[] StringToCharArray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
	
				ch[i]=s.charAt(i);
			}
		
		return ch;
	}
	
	public static void main(String[] args) {
		char ans[]=StringToCharArray("qspiders");
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}

}



