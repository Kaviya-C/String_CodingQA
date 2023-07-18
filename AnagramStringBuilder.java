package string.learn;

public class AnagramStringBuilder 
{
	public static void isAnagram(String s1,String s2)
	{
		String copyS1=s1.replaceAll("\\s+","").toLowerCase();
		String copyS2=s2.replaceAll("\\s+", "").toLowerCase();
	    boolean status=true;
	   if(copyS1.length()!=copyS2.length())
	   {
		   status=false;
	   }
	   else
	   {
		   char[] s1Array=copyS1.toCharArray();
		   
		   StringBuilder sb=new StringBuilder(copyS2);
		   
		   for(char c:s1Array)
		   {
			   int index=sb.indexOf(""+c);
			   if(index!=-1)
			   {
				   sb=sb.deleteCharAt(index);
			   }
			   else
			   {
				   status=false;
				   break;
			   }
		   }
	   }
	   if(status)
	   {
		   System.out.println("two string are anagram");
	   }
	   else
	   {
		   System.out.println("two string are not anagram");
	   }
	
	
	}
	public static void main(String...args)
	{
		isAnagram("silent cat","listen act");
	}

}
