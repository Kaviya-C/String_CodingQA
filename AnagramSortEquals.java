package string.learn;

import java.util.Arrays;

public class AnagramSortEquals 
{
	public static void isAnagram(String s1,String s2)
	{
		String copyS1=s1.replaceAll("\\s+", "").toLowerCase();
		String copyS2=s2.replaceAll("\\s+", "").toLowerCase();
		boolean equals=true;
		if(copyS1.length()!=copyS2.length())
		{
			equals=false;
		}
		else
		{
			char[] charS1=copyS1.toCharArray();
			char[] charS2=copyS2.toCharArray();
			
			Arrays.sort(charS1);Arrays.sort(charS2);
			equals=Arrays.equals(charS1, charS2);
		}
		if(equals)
		{
			System.out.println("given two string are anagrams");
		}
		else
			System.out.println("Two string is not anagrams");
	}
	public static void main(String...args)
	{
		//Anagram prog using sort() and equals()
		
		isAnagram("Mother in law","Hitler Woman");
	}

}
