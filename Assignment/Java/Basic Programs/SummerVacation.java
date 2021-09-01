import java.util.Scanner;
public class SummerVacation{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num ,n ,reverse=0;
		System.out.println("Enter an integer value: ");
		num = sc.nextInt();
		for(int i=9; i>=0; i--)
		{
			int temp=num;
			while (temp>0)
			{
				n= temp %10;;
				if(n == i)
				{
					reverse *=10;
					reverse +=n;
				}
				temp/= 10;
			}
		}
		System.out.println("Reversed Number: "+reverse);
	}
}
				