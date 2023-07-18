package string.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedFirstNonRepeatedChar
{
	public static void repetetion(String s)
	{
		Map<Character,Integer>map=new HashMap<>();
		
		char[] character=s.toCharArray();
		
		for(char each:character)
		{
			if(map.containsKey(each))
			{
				map.put(each, map.get(each)+1);
			}
			else
			{
				map.put(each, 1);
			}
		}
		
		for(char key:character)
		{
			if(map.get(key)==1)
			{
				System.out.println("first Non-repeated character: "+key);	
			    break;
			}
		}
		for(char key:character)
		{
			if(map.get(key)>1)
			{
				System.out.println("first Repeated Characters: "+key);
				break;
			}
			
			
		}
	}
	public static void main(String...args)
	{
		repetetion("fanclubu");
	}

}








