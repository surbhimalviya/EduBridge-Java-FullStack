import java.util.Scanner;
public class Descending
{
public static void main(String args[])
{
	int x,y,z;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value x , y , z ");
	x=sc.nextInt();
	y=sc.nextInt();
	z=sc.nextInt();
	if (x>=y && y>=z)
	{
		System.out.println("order"+x+"  "+y+"  "+z);
	}
	else if (y>=x &&z>=y)
	{
		System.out.println("order"+z+" "+y+"  "+x);
	}
	
	else if (y>=x && x>=z)
	{
		System.out.println("order"+y+"  "+x+"  "+z);
	}
	else if (z>=x && x>=y)
	{
		System.out.println("order"+z+"  "+x+"  "+y);
	}
	else 
	{
	System.out.println("order"+x+"  "+z+"  "+y);
	}	
}
}