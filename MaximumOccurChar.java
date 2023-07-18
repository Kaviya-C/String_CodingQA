package string.learn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccurChar 
{
	public static void maxCharOccured(String s)
	{
		
		Map<Character,Integer> map=new HashMap<>();
		char[] character=s.toCharArray();
		
		for(int index=0;index<character.length;index++)
		{
			if(map.containsKey(character[index]))
			{
				map.put(character[index], map.get(character[index])+1);
			}
			else
			{
				map.put(character[index],1);
			}
		}
		Set<Entry<Character, Integer>> entries=map.entrySet();
		int maxCount=0;char maxChar=' ';
		for(Entry<Character,Integer> entry:entries)
		{
			if(entry.getValue()>maxCount)
			{
				maxCount=entry.getValue();
				maxChar=entry.getKey();
			}
		}
		System.out.println("maximum  character is "+maxChar+" repeated "+maxCount+" times");
	}
	public static void main(String...args)
	{
		maxCharOccured("madam");
	}

}
