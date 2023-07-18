package string.learn;
//rotation u have to take one or two word then change the positions
 // eg  heenaweddijosherama
//ramaheenaweddijoshe
public class OneStringRotationAnotherString 
{
	public static void main(String...args)
	{
		String s1="heenaweddijosherama";
		String s2="weddijosheramaheena";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s2 is not rotated version of s1");
		}
		else
		{
			String s3=s1+s1;
			System.out.println(s3);
			System.out.println(s2);
			if(s3.contains(s2))
			{
				System.out.println("s2 is a rotated version of s1");
			}
			else
			{
				System.out.println("s2 is not a rotated version of s1");
			}
		}	
	}
}
