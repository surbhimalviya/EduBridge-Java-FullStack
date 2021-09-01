class First
{
		void data()
		{
			System.out.println("i am using super class");
		}
}
class Second extends First
{
	void msg()
	{
		System.out.println("i am using sub class");
	}
	public static void main(String s[])
	{
		Second se =new Second();
		se.data();
		se.msg();
	}
}