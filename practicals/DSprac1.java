//Write a program to find out largest number from the array and also find its location .
import java.util.*;
class DSprac1{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array you want :");
		int a = scan.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the all elements in an array :");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		int max = arr[0];
		int loc = 0;
		for(int j = 0; j<arr.length; j++)
		{
			if(arr[j] > max)
			{
				max = arr[j];
				loc = j;
			}
			System.out.print(arr[j]+"\t");
		}
		System.out.println("\nThe Largest element in an array is :"+max);
		System.out.println("The location of the element in an array is :"+loc);
	}
}
