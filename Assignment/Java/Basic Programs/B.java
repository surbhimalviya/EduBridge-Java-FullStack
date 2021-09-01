class Parent{
void show()
{
System.out.println("Good Morning");
}
}
 class B extends Parent{
	 static void show(Parent a)
	 {
		 if(a instanceof B)
		 {
			 B b=(B)a;
	 System.out.println("My Work is Done");
 }
 }
public static void main(String[] args)
	{
			Parent a=new B();
			B.show(a);
}
}