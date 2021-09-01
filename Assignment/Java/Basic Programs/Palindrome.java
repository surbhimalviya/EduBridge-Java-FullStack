import java.util.Scanner;

public class Palindrome{
	static Boolean isPalindrome(String str)
	{
		int i=0, j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String str="surbhi";
		if(isPalindrome(str))
			System.out.println("is palindrome");
		else
		System.out.println("is not palindrome");
	}
}