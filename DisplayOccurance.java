import java.util.*;
class DisplayOccurance
{
	public static void main(String args[])
	{
		String input = "BABAKADHABAKAKI";
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		String eachChars[] = new String[input.length()];
		int eachCharsCount[] = new int[input.length()];
		for(int i=0;i<input.length();i++) eachCharsCount[i] = 0;
		int noOfChar = 0;
		for(int i=0;i<input.length();i++)
		{
			String charStr = "" + input.charAt(i);
			int indx = getIndexOfCharInArray(eachChars,noOfChar,charStr);
			if(indx >=0 )
			{
				eachCharsCount[indx] += 1; 
			}
			else
			{
				eachChars[noOfChar] = charStr;
				noOfChar += 1; 
			}
		}
		for(int i=0;i<noOfChar;i++)
		{
			System.out.println(eachChars[i] + " : " + (eachCharsCount[i] + 1));
		}
	}
	
	static int getIndexOfCharInArray(String eachChar[],int len, String cmpStr)
	{
		for(int i=0;i<len;i++)
		{
			if(eachChar[i].equals(cmpStr))
			{
				return i;
			}
		}
		return -1;
	}
	
	
}