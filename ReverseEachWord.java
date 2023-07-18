package string.learn;

public class ReverseEachWord
{
	public static void reverseEachWord(String s1)
	{
		String[] eachWordArray=s1.split("\\s+");
		
		String result="";
		
		for(int index=0;index<eachWordArray.length;index++)
		{
			String word=eachWordArray[index];
			
			String reverseChar="";
			
			for(int el=word.length()-1;el>=0;el--)
			{
				reverseChar=reverseChar+word.charAt(el);
			}
			result=result+reverseChar+" ";
			
		}
		System.out.println(result);
		
		
	}
	public static void main(String[] args)
	{
		reverseEachWord("Kaviya java Developer");
	}

}
