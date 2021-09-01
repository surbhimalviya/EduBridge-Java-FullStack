import java.util.*;
public class Addclr{
	public static void main(String[] args)
	{
		 PriorityQueue<String> color =new PriorityQueue<String>();
		 PriorityQueue<String> color2= new PriorityQueue<String>();
		 color.add(" Green");
		  color.add(" Red");
		   color.add("Blue ");
		    color.add("Yellow ");
			 color.add(" Black");
			 
			 System.out.println(color);
			 
			 color2.addAll(color);
			 System.out.println(color2);
	}
}