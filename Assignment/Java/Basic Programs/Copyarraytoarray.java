import java.util.Scanner;
public class Copyarraytoarray
{
	public static void main(String[] args)
	{
	int arr[] = new int[5];
	int arr1[] = new int[5];
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements array ");
		
		for (int i =0; i<5; i++)
			{
			arr[i]=sc.nextInt();
			}
			System.out.println("the elements array1 :" );
			for (int i =0; i<5; i++)
				{
				System.out.println(arr[i]+" ");
				}
		System.out.println("");
		for (int i =0; i<5; i++)
			{
			arr1[i]=arr[i];
			}
			System.out.println("the elements array2 :" );
		for (int i =0; i<5; i++)
			{
			System.out.print(arr1[i]+" ");
			}
		
	}
}