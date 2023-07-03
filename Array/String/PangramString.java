package assignment;

public class PangramString {

	
	public static void main(String[] args) 
	{
		String s1="pack of my box with five dozen liquor jugs".toUpperCase();
		int count=0;
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(i==s1.charAt(i))
				{
					count++;
					break;
					
				}
			}
		}
		if(count==26)
		{
			System.out.println("panagram");
			
		}
		else
		{
			System.out.println("not panagram");
		}
		
		
		
	}
}
