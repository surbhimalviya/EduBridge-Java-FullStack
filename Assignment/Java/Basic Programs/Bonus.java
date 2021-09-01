import java.util.Scanner;
public class Bonus
{
public static void main(String args[])
{
	float salary, bonus, update;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the salary :");
	salary=sc.nextFloat();
	if(salary>2000)
	{
		bonus=(float)(0.10*2000);
		update=bonus+salary;
	    System.out.print("Increment salary with 10% bonus" +update);
	}
	else 
	{
		System.out.println("salary is not greater than 2000");
	}
}
}