class Office
{
	Office()
	{
	System.out.println("welcome to office");
	}		
}
class Emp extends Office
{   
    Emp()
	{
		super();
	System.out.println("I am working here");
	}	
}
	public class Superkey2
	{
	public static void main(String[] args)
	{
        new Emp();
	}
	}
