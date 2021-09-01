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
 class main2{
public static void main(String[] args)
	{
			Parent c=new Child();
			Child c1=(Child)c;
			c.show();
}
}