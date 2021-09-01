class A{
	int count;
	public synchronized void counter()
	{
		count++;
	}
}
public class Meths{
	public static void main(String[] args) throws Exception
	{
		A a =new A();
		Thread t=new Thread(new Runnable() {
			public void run(){
		for(int i=0;i<=1000;i++)
		{
			a.counter();
		}
			}
		});Thread t1=new Thread(new Runnable() {
			public void run(){
		for(int i=0;i<=1000;i++)
		{
			a.counter();
		}
			}
		});
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println("value of count "+a.count);
	}
}