package string.learn;

public class CountTotalNoOccurencesGivenChar 
{
	public static void main(String...args)
	{
		String  s="Always Favourite Java";
		
		char c='a';
		
		int count=s.length()-s.replace("a","").length();
		
		System.out.println("No of Occurences: "+s+" ="+count);
	
	   //count=totalLength-after replacing a with none then all a character removed now length is 17
		// so 21-17 we get 4 
		// no of times a repeates is 4..
	}

}
