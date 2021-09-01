public class Cellphone
{
	void methodeOne(){
		System.out.println("Ringing");
	}
	void methodeTwo(){
		System.out.println("Vibrating");
	}
	void methodeThree(){
		System.out.println("Silent");
	}
	public static void main(String[] args)
	{
		Cellphone c=new Cellphone();
		c.methodeOne();
		c.methodeTwo();
		c.methodeThree();
	}
}