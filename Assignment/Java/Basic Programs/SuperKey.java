class College
{
		String name ="Delhi University";
}
class Student extends College
{   
    String name="surbhi";
	void printName()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
	public class SuperKey
	{
	public static void main(String[] args)
	{
		Student se =new Student();
		se.printName();
		
	}
	}
