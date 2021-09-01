import java.util.*;
public class Binarysearch
 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {11,22,33,44,67,89,90};

		System.out.println("Enter the element that you want to search:");
		int key=sc.nextInt();
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
		if(arr[mid]<key) {
		first=mid+1;
		}
		else if(arr[mid]==key) {
		System.out.println("Element found at index:"+mid);
		break;
		}
		else {
		last=mid-1;
		}
		mid=(first+last)/2;
		}
		if(first>last) {
		System.out.println("Element not found");

		}

	}

}