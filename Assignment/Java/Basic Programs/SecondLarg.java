import java.util.Scanner;
public class SecondLarg
	{
		public static void main(String[] args)
		{
		int arr[] = new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 elements value ");
		for (int i =0; i<5; i++)
			{
			arr[i]=sc.nextInt();
			}
			System.out.println("the elements are :" );
			for (int i =0; i<5; i++)
				{
				System.out.println(arr[i]);
				}
				for (int i =0; i<5; i++)
				{	
					for (int j =i+1; j<5; j++)
						{
						if(arr[i]<arr[j])
						   {
							   temp=arr[i];
							   arr[i]=arr[j];
							   arr[j]=temp;
						   }
						}
				}
				System.out.print("Decending array");
				for (int j =0; j<5; j++)
						{
						System.out.println(arr[j]);
						}
						System.out.print("Second largest element " +arr[1]);
		}
	}