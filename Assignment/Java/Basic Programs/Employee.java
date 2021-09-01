import java.util.*;
class Employee
{
	Employee()
	{
	System.out.println("Hii, i am employee");	
	}
	Employee(String s, int i)
	{
	System.out.println("name of first employee:" +s);
    System.out.println("id of first employee:" +i);
    }	
	
	Employee(String s, int i, int salary)
	{
	System.out.println("name of second employee:" +s);
    System.out.println("id of second employee:" +i);
    System.out.println("salary of second employee:" +salary);
    }   	
	
	public static void main(String[] args)
	{
		Employee e  =new Employee();
		Employee e1  =new Employee("surbhi", 1);
		Employee e2 =new Employee("disha", 2, 20000);
		
	}
}