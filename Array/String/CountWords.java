package string2;

public class CountWords {
public static void main(String[] args) {

	String s1="I am learning Program";
	String s2[]=s1.split("");
	
	int max=0;
	for(int i=0;i<s2.length;i++)
	{
         if(max<s2[i].length())
		{
		   max=s2[i].length();
		}
	}
	
	
	for(int i=0;i<s2.length;i++)
	{
		if(s2[i].length()==max)
		{
			System.out.println(s2[i]);
		}
	}
	
	
}
}
