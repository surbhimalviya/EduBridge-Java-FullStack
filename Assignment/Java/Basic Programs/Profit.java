import java.util.*;
public class Profit
{
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the cost price ");
	double cp=sc.nextDouble();
	System.out.print("enter the selling price ");
	double sp=sc.nextDouble();
	
	if (cp - sp > 0)
	{
		System.out.println("loss is " +(cp-sp));
	}
	else if (cp - sp < 0)
	{
		System.out.println("profit is " +(sp-cp));
	}
	
	else 
	{
		System.out.println("no loss and no profit");
	}
}
}