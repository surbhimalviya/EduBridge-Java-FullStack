import java.util.*;
class Solution
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String result ="yes";
		int length=x.length();
		for(int i=0; i<length/2; i++)
		{
			if(x.substring(i,i+1).equals(x.substring(length-i-1,length-i)))
			{
			}
			else
			{
				result= "No";
			}
		}
		System.out.println(result);
	}
}