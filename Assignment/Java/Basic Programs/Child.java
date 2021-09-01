class std{
void info()
{
System.out.println("Good Morning");
}
}
 class Child extends Parent{
 void info()
 {
	 System.out.println("My Work is Done");
 }
 }
	 
public static void main(String[] args)
	{
			Child c=new Child();
			c.info();
}
}