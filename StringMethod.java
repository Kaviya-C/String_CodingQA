package string.learn;

public class StringMethod 
{
	public static void main(String...args)
	{
		String s="kaviya";
		String s1="kaviya";
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.compareTo(s1));
		
		// String intern--process of creating exact copy which is in heap memory string object in string constant pool.
		
	    String s2=new String("Java Developer");
	    
	    String s3="Java Developer";
	    
	    String s33=s2.intern();
	    
	    System.out.println(s3==(s33));
	}

}
