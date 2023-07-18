package string.learn;

public class RemoveAllWhiteSpaces 
{
	public static void main(String...args)
	{
		String s="Rama Seetha Vinay";
		
		System.out.println(s.replaceAll("\\s+",""));
		
		//trim() --remove spaces from the start and end not between
		
		//without built in method
		
		char[] character=s.toCharArray();
		
		String result="";
		for(int index=0;index<character.length;index++)
		{
			
			if((character[index]!=' '&&character[index]!='\t'))
			{
				result+=character[index];
			}
		}
		System.out.println(result);
	}
	
	

}
