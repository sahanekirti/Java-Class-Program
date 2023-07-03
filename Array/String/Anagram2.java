package string2;

public class Anagram2 {

 String s1="keep";
 String s2="peek";
 
 char []ch1=s1.toCharArray();
 char []ch2=s2.toCharArray();
  
 int count=0;
 if(ch1.length==ch2.length)
 {
	 for(int i=0;i<ch1.length;i++)
	 {
		for(int j=0;j<ch2.length;j++)
		{
			if(ch1[i]==ch1[i])
			{
				count++;
				ch2[j]='u\0000';
			}
		}
	
	 }
	 if(count==ch.length)
	 {
		 System.out.println("anagram");
	 }
	 else
	 {
		 System.out.println("not anagram");
	 }
 }     
 else {
          System.out.println("not anagram");
 }
	
 }
