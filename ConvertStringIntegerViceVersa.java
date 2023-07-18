package string.learn;

public class ConvertStringIntegerViceVersa 
{
	public static void conversionStringInteger(String s)
	{
		Integer o=Integer.valueOf(s);
		Integer i=Integer.parseInt(s);
		
		System.out.println(i);
		System.out.println(o);
	}
	
	public static void convertIntegerToString(int i)
	{
		String a=Integer.toString(i);
		
		String s=String.valueOf(i);
		
		System.out.println(a);
		
		System.out.println(s);
	}
	public static void main(String...args)
	{
		conversionStringInteger("123");
		
		convertIntegerToString(123);
	}

}
