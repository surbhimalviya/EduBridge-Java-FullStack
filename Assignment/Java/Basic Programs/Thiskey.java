import java.util.*;
class Student
{
	int id;
	String name;
	float fee;
	Student(int id, String name, float fee)
	{
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+fee);
	}
}
public class Thiskey
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the ID :");
		int id=sc.nextInt();
		System.out.print("enter name :");
		String name=sc.next();
		System.out.print("enter fees :");
		float fee=sc.nextFloat();
		Student s1= new Student(id,name,fee);
		s1.display();
		sc.close();
		}
}