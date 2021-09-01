class Parent{
void show()
{
System.out.println("Good Morning");
}
}
 class Child extends Parent{
 void show()
 {
	 System.out.println("My Work is Done");
 }
 }
 class main{
public static void main(String[] args)
	{
		//
			Child c=new Child();
			c.show();
}
}