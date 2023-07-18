package string.learn;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepChar
{
	public static void longestSubString(String a) {
		char[] character=a.toCharArray();
		String longestSub="";
		int lengthSubString=0;
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int index=0;index<character.length;index++)
		{
			char ch=character[index];
			
			if(!map.containsKey(ch))
			{
				map.put(ch, index);
			}
			else
			{
				index=map.get(ch);
				map.clear();
			}
			if(map.size()>lengthSubString)
			{
				lengthSubString=map.size();
				longestSub=map.keySet().toString();
			}
		}
		
		System.out.println("input: "+a);
		System.out.println("LongestSubString: "+longestSub);
		System.out.println("Length of longest substring:  "+lengthSubString);
	}
	public static void main(String...args)
	{
		longestSubString("ramavinay");
	}

}
