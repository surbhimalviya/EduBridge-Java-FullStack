public class StringEg
{
	public static void main(String[] args)
	{
		int arr[] =new int[8];
		try{
		for(int i=0; i<10; i++)
		{
			System.out.println(arr[i]);
	System.out.println("your code is index out of bound");
		}
		}
		catch(Exception e){
	System.out.println(e);
	}
}

}