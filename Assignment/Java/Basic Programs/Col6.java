import java.util.*;
public class Col6{
	public static void main(String[] args)
	{    
		 Map<Integer, String>item =new HashMap<Integer, String>();
		 item.put(101,"surbhi");
		 item.put(132,"somi");
		 item.put(144,"simmi");
		 
		 Set<Integer> keys=item.keySet();
		 for(int i:keys)
		 {
			 
		 System.out.println(item.get(i));
		 }
	}	 
			
}