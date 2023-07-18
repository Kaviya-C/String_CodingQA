package string.learn;
import java.util.Map;
import java.util.HashMap;
public class CountEachCharOccurences
{
	public static void eachCharOccur(String sent)
	{
		sent = sent/* .replaceAll("\\s+","" ) */.toLowerCase();
		Map<Character,Integer> map=new HashMap<>();
		
		char[] charac=sent.toCharArray();
		
		for(int index=0;index<charac.length;index++)
		{
			if(map.containsKey(charac[index]))
			{
				map.put(charac[index],map.get(charac[index])+1);
			}
			else
			{
				map.put(charac[index], 1);
			}
		}
		System.out.println(map);
	}
	
	//count of each character in a string
	public static void main(String...args)
	{
		eachCharOccur("jaAa e");
	}

}
