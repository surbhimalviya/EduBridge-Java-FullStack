import java.util.*;
public class Dupchar{
	public static void main(String[] args)
	{
		
			String s = "Java Fullstack";
			int count;
		char string[]=s.toCharArray();
		System.out.println("Duplicate characters in given string: ");
		
		for(int i=0;i<string.length; i++)
		{
			count=1;
			for(int j=i+1; j<string.length; j++)
			{
				if(string[i]==string[j])
				{
					count++;
					string[j] ='0';
				}
			}
			if(count>1 && string[i] !='0')
				
		System.out.println(string[i]);
	}
}
}
				