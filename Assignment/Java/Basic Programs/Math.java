import java.util.*;
class Math
{
	int sum(int x, int y)
	{
	int z=x+y;
	return z;
	}
	public static void main(String s[])
	{
		Math m =new Math();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number :");
		int x=sc.nextInt();
		
		System.out.print("enter second number :");
		int y=sc.nextInt();
		int res=m.sum(x,y);
		System.out.print(res);
	}
}