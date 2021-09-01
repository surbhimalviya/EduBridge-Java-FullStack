class std{
void info()
{
System.out.println("Test Cases");
}
}
 class Case extends Test{
 void show()
 {
	 System.out.println("Test");
 }
 }
 public class Information{
	 
public static void main(String[] args)
	{
			Test t=new Test();
			Case b=new Case();
			System.out.println(t instanceof Test);
			System.out.println(b instanceof Test);
			System.out.println(b instanceof Case);
			
}
}