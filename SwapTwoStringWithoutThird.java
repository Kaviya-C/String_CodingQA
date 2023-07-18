package string.learn;

public class SwapTwoStringWithoutThird 
{
	public static void swapTwoStrings(String word1,String word2)
	{
		System.out.println("before Swapping: "+(word1+" "+word2));
		
		word1=word1+word2;
		
		word2=word1.substring(0,word1.length()-word2.length());
		
		word1=word1.substring(word2.length());
		
		System.out.println("After Swapping: "+(word1+" "+word2));
	}
	public static void main(String...args)
	{
		swapTwoStrings("Kaviya","Java");
	}

}
