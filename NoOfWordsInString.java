package string.learn;

public class NoOfWordsInString 
{
	public static void main(String...args)
	{
		//Without using built in method to find the no of words in a string
		
		String s="Kaviya Java Developer In 2023";
		
		int count=1;// kaviya that word is already there so count is 1
				
	    for(int index=0;index<s.length();index++)
	    {
	    	if((s.charAt(index)==' ')&&(s.charAt(index+1)!=' '))
	    	{
	    		count++;
	    	}
	    }
	    System.out.println("Given String: "+s);
	    System.out.println("No of words in a given String: "+count);
	
	
	//with built in methods
	    
	    String[] arrayStrings=s.trim().split(" ");
	    System.out.println("No of Words: "+arrayStrings.length);
	
	
	}

}
