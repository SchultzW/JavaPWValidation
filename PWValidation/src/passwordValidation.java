import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class passwordValidation 
{
	public static void main(String[]args)
	{
		 String newLine = System.getProperty("line.separator");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a new password. It must contain the following:"
				+ newLine+"1 uppercase character"+newLine+"1 lowercase character"+newLine+ "1 number"+newLine+"1 special character");
		String newPW= in.nextLine();
		System.out.println(pwCheck(newPW));
	}
	
	public static String pwCheck(String pwString)
	{
		String message="";
		Boolean upperFlag,lowerFlag,numFlag,specialFlag;
		char[]cArray=pwString.toCharArray();
		upperFlag=upperCheck(cArray);
		if(upperFlag==false)
			message="Your password needs an uppercase.";
		lowerFlag=lowerCheck(cArray);
		if(lowerFlag==false)
			message+="Your password needs a lowercase.";
		numFlag=numberCheck(cArray);
		if(numFlag==false)
			message+="Your password needs a number.";
		specialFlag=specialCheck(cArray);
			if(specialFlag==false)
				message+="Your password needs a special character.";
		if(upperFlag==true&&lowerFlag==true&&numFlag==true&&specialFlag==true)
			message="Your password has been changed.";
		return message;
		
	}
	public static Boolean upperCheck(char[]array)
	{
		for(int i=0;i<=array.length-1;i++)
		{
			if(Character.isUpperCase(array[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static Boolean lowerCheck(char[]array)
	{
		for(int i=0;i<=array.length-1;i++)
		{
			if(Character.isLowerCase(array[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static Boolean numberCheck(char[]array)
	{
		for(int i=0;i<=array.length-1;i++)
		{
			if(Character.isDigit(array[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static Boolean specialCheck(char[]array)
	{
		char[] specialArray = new char[] {'!','@','#','$','%','^','&','*'};
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<specialArray.length-1;j++)
			{
				if(array[i]==specialArray[j])
				{
					return true;
				}
						
			}
		}
				
		return false;
	}
	
}
