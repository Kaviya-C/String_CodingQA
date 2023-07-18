package string.learn;

public class ReverseStringDiffMethods
{
	static String recursiveRev(String s)
	{
		if((null==s)||(s.length()<=1))
		{
			return s;
		}
		return recursiveRev(s.substring(1))+s.charAt(0);
				
	}
	
	public static void main(String...args)
	{
		//Using iterative method to reverse the string:
		String s="kaviya java Developer";
		char[] character=s.toCharArray();
		for(int index=character.length-1;index>=0;index--)
		{
			System.out.print(character[index]+"");
		}
		System.out.println();
		
		//using stringBuffer
		
		StringBuffer sb=new StringBuffer(s);
		String result=sb.reverse().toString();
		System.out.println("Reversed String: "+result);
		
		
		//using recursive method call
		
		String a="kaviya java";
		System.out.println(recursiveRev(a));
	}
}
