package string;

public class StringMethod {
	public static void main(String[] args) {
		String s="Photosynthesis";
		
		System.out.println(s.charAt(4));
		System.out.println(s.concat("happens with plant"));
		System.out.println(s.contains("Photo"));
		System.out.println(s.contains("photo"));
		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf("synth", 5));
		System.out.println("".isEmpty());
		System.out.println(s.lastIndexOf("synth"));
		System.out.println(s.length());
		System.out.println(s.replace('t', '#'));
		System.out.println(s.replace("Photo", "plant"));
		
		String[] str=s.split("s");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
			
		}
		System.out.println(s.startsWith("pho"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 9));
		
		char ch[]=s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			System.out.println(ch[i]);
			
		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("      raju   ".trim());
		
	}

}
