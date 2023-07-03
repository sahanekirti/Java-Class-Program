package string2;

public class EqualsMethod {

      String a;
      EqualsMethod(String a)
      {
    	  this.a=a;
    	  
      }
      public static void main(String[] args) {
    	  EqualsMethod d1 =new EqualsMethod("hello");
    	  
		 EqualsMethod d2= new EqualsMethod("hello");
		 
		 System.out.println(d1.equals(d2));
	}
      
      public boolean equals(Object o1)
      {
    	  EqualsMethod d1=(EqualsMethod)o1;
    	  String a=this.a;
    	  String b=d1.a;
    	  if(a.length()==b.length())
    	  {
    		  for(int i=0;i<a.length();i++)
    		  {
    			  if(a.charAt(i)==b.charAt(i))
    			  {
    				  
    			  }
    			  else
    			  {
    				  return false;
    			  }
    		  }
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      }
}

