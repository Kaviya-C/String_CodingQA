package string.learn;
import java.text.DecimalFormat;
public class PercentageUpLoDiSp 
{
	public static void percentage(String s)
	{
		int upper=0;int lower=0;int digit=0;int special=0;
		int totalLength=s.length();
		for(int index=0;index<s.length();index++)
		{
			char ch=s.charAt(index);
			if(Character.isUpperCase(ch))
				upper++;
			else if(Character.isLowerCase(ch))
				lower++;
			else if(Character.isDigit(ch))
				digit++;
			else
				special++;	
		}
		double upperPercent=(upper*100.0)/totalLength;
		double lowerPercent=(lower*100.0)/totalLength;
		double specialPercent=(special*100.0)/totalLength;
		double digitPercent=(digit*100.0)/totalLength;
		DecimalFormat d=new DecimalFormat("##.##");
		System.out.println("Upper Percentage: "+d.format(upperPercent));
		System.out.println("Lower Percentage: "+d.format(lowerPercent));
		System.out.println("Special Percentage: "+d.format(specialPercent));
		System.out.println("digit Percentage: "+d.format(digitPercent));
	  
	
	}
	public static void main(String...args)
	{
		percentage("Kaviya@learn java#2023");
	}

}
