import java.util.*;
public class ExceptionDemo{
	public static void main(String[] args)
	{
		try{
			String student[]= {"Surbhi", "Shivani","Anushka"};
			int Id[]={1,2,3};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and Id ");
		String s=sc.nextLine();
		int n=sc.nextInt();
		student[student.length+1]=s;
		Id[Id.length+1]=n;
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		System.out.println(e);
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
}
}
				