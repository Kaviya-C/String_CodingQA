package string.learn;

public class AnagramIterativeMethod
{
	public static void isAnagram(String s1,String s2)
	{
		String copyS1=s1.replaceAll("\\s+", "").toLowerCase();
		String copyS2=s2.replaceAll("\\s+", "").toLowerCase();
		boolean status=true;
		if(copyS1.length()!=copyS2.length())
		{
			status=false;
		}
		else
		{
			char[] s1Array=s1.toCharArray();
			
			for(char each:s1Array)
			{
				int index=copyS2.indexOf(each);
				
				if(index!=-1)
				{
					//0,1=====+1,2
					//at
					//t
					copyS2=copyS2.substring(0,index)+copyS2.substring(index+1,copyS2.length());
					//pee
					//pe
					//p
					System.out.println(copyS2);
				}
				else
				{
					status=false;
					break;
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
	}
	public static void main(String...args) {
		isAnagram("cat","act");
	}
}
