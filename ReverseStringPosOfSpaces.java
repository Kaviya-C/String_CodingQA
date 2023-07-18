package string.learn;

import java.util.Arrays;

public class ReverseStringPosOfSpaces {
	public static void reverseStringPosition(String sentence) {
		
		char[] character=sentence.toCharArray();
		
		char[] resultant=new char[character.length];
		//for space in our own array
		for(int space=0;space<character.length;space++)
		{
			if(character[space]==' ')
			{
				resultant[space]=character[space];
			}
		}
		
		// reverse the string according to its position
		
		int length=resultant.length-1;
		for(int index=0;index<character.length;index++)
		{
			if(character[index]!=' ')
			{
				if(resultant[length]==' ')
				{
					length--;
				}
				resultant[length]=character[index];
				length--;
			}
			
		}
		System.out.println(sentence+"----->"+(String.valueOf(resultant)));

	}

	public static void main(String... args) {
		reverseStringPosition("hel gone");
	}

}
