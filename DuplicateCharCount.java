package string.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount 
{
	public static void duplicateCharCount(String s)
	{
		Map<Character,Integer> map=new HashMap<>();
		
		char[] characters=s.toCharArray();
		
		for(int index=0;index<characters.length;index++)
		{
			if(map.containsKey(characters[index]))
			{
				map.put(characters[index],map.get(characters[index])+1);
			}
			else
			{
				map.put(characters[index],1);
			}
		}
		Set<Character> onlyKeys=map.keySet();
		
		for(char eachCharacter:onlyKeys)
		{
			if(map.get(eachCharacter)>1)
			{
				System.out.println("Duplicate character: "
			+eachCharacter+" occured: "+map.get(eachCharacter));
			}
		}
	}
	public static void main(String...args)
	{
		//find the duplicate character and that character count i want to display
		
		duplicateCharCount("java yayv");
	}

}
