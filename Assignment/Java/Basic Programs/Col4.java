import java.util.*;
public class Col4{
	public static void main(String[] args)
	{    
		 LinkedHashMap<Integer, String> item =new LinkedHashMap<Integer, String>();
		 item.put(101,"surbhi");
		 item.put(102,"somi");
		 item.put(103,"simmi");
		 
		 Set<Map.Entry<Integer,String>>keys=item.entrySet();
		 for (Map.Entry<Integer,String>i:keys)
		 {
			 
		 System.out.println(i.getKey()+" "+i.getValue());
		 }
	}	 
			
}