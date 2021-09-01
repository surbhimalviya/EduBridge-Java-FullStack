import java.util.*;
public class Maximumsum {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
int evensum=0,oddsum=0;
if(n<0) {
System.out.println("Invalid array size");
System.exit(0);
    }
else {
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
   if(arr[i]<0) {
System.out.println("Invalid input");
System.exit(0);
   }
 }
   for(int j=0;j<n;j++) {
    if(arr[j]%2==0) {
    evensum+=arr[j];
    }
    else {
    oddsum+=arr[j];
    }
   }
     }
   System.out.println("sum of even numbers:"+evensum);
   System.out.println("sum of odd numbers:"+oddsum);
   if(evensum>oddsum) {
    System.out.println("Sum of even elements is maximum:"+evensum);
   }
   else {
    System.out.println("Sum of odd elements is maximum:"+oddsum);
   }
   
}
}