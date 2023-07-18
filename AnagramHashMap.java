package string.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramHashMap 
{
	//sorts  equals method
	public static void isAnagram(String s1,String s2)
	{
		String copyS1=s1.replaceAll("\\s+", "").toLowerCase();
		String copyS2=s2.replaceAll("\\s+", "").toLowerCase();
		
		boolean status=true;
		Map<Character,Integer> map=new HashMap<>();
		
		for(int index=0;index<copyS1.length();index++)
		{
			char charAsKey=copyS1.charAt(index);
			int charCount=0;
			if(map.containsKey(charAsKey))
			{
				charCount=map.get(charAsKey);
			}
			map.put(charAsKey, ++charCount);
			
			charAsKey=copyS2.charAt(index);
			charCount=0;
			if(map.containsKey(charAsKey))
			{
				charCount=map.get(charAsKey);
			}
			map.put(charAsKey, --charCount);	
		}
		for(int value:map.values())
		{
			if(value!=0)
			{
				status=false;
			}
		}
		
		
		
		if(status)
		{
			System.out.println("Two strings are anagram");
		}
		else
		{
			System.out.println("Two strings are not anagram");
		}
	}
	public static void main(String...args)
	{
		isAnagram("mother in law","hitler woman");
	}
}