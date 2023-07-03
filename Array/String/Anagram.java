package string2;

public class Anagram {

	public static void main(String[] args) {
		String s1="keep";
		String s2="peek";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
//		String s2[]=s1.split("");
		
	int count=0;
	if(ch1.length()==ch2.length())
	{
	for(int i=0;i<ch1.length;i++)
	{
		for( int j=0;j<ch2.length;j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
			}
		}
	}
	if(count==ch1.length)
	{
		System.out.println("anagram");
	}
	else
	{
		System.out.println("not anagram");
	}
	}
	else
		sysout
	

 
}
		

}
