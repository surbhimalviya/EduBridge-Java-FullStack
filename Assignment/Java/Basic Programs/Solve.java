import java.util.*;
class Parent
{
	public void func()
	{
		System.out.println("Hello i am  a motorcycle, i am cycle with an engine.");
	}
}
class Child extends Parent
{
   public void func()
   {
	   super.func();
	System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
}
}
public class Solve
{
	public static void main(String[] args)
	{
	Child s=new Child();
    s.func();
	}
}