import java.util.*;
class Statb1
{
	static int num;
	static String mystr;
	static
	{
		System.out.println("first student detail");
		num=65;
		mystr="surbhi";
	}
	static
	{
		System.out.println("second student detail");
		num=88;
		mystr="sejal";
	}
	public static void main(String[] args)
	{

	System.out.println("student ID :" +num);
	System.out.println("Student Name :" +mystr);
	
	}
}
