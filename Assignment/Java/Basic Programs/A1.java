import java.util.*;
class A1
{
	public static void main(String args[])
	{
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Surbhi");
		alist.add("Suman");
		alist.add("Sejal");
		alist.add("Simmi");
		alist.add("Sumu");
		
		System.out.println(alist);
		alist.add(1,"Om");
		alist.set(3,"Sumu");
		alist.remove("Sejal");
		System.out.println(alist);
	}
}