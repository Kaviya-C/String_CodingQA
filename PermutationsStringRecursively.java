package string.learn;

public class PermutationsStringRecursively 
{
	public static void stringPermutation(String str)
	{
		mainPermutation("",str);
	}
	public static String mainPermutation(String permute,String input)
	{
		if(input.length()==0)
		{
			System.out.println(permute);
		}
		else
		{
			for(int index=0;index<input.length();index++)
			{


				String s=mainPermutation(permute+input.charAt(index)
				,input.substring(0,index)+
				input.substring(index+1,input.length()));
			    System.out.print(s);
			   // return "k";
			}
		}
		return "";
	}
	public static void main(String...args)
	{
		stringPermutation("ram");
	}

}
