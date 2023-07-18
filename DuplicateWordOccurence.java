package string.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class DuplicateWordOccurence
{
	public static void duplicateWordOccur(String sentences)
	{
		String[] s=sentences.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		
		for (String word:s)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
				map.put(word, 1);
		}
		Set<String> wordsInString=map.keySet();
		for(String result:wordsInString)
		{
			if(map.get(result)>1)
			System.out.println(result+" repeated "+map.get(result)+" times");
		}
	}
	public static void main(String...args)
	{
		String s=new String("Bread Butter Bread Butter");
		
		duplicateWordOccur(s);
	}

}
