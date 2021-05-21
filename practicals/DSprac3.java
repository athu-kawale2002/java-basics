//3. Write a Program to a) insert an element in an array b)delete an element from an array.
import java.util.*;
class DSprac3
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of an array :");
		int a = scan.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the elements in an array :");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the element to be inserted :");
		int e = scan.nextInt();
		System.out.println("Enter the position at which element is to be inserted :");
		int n = scan.nextInt();
//*************Insertion of elements***************
		for(int j = n-1; j >= n; j--)
		{
			arr[j] = arr[j - 1];
		}
		arr[n - 1] = e;
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		System.out.println("The updated array will be :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]+"\t");
		}
//************Deletion of elements**************
		System.out.println("Enter the position of element is to be deleted");
		int d = scan.nextInt();
		//int n = arr.length; 
		for(int i = d-1; i<(arr.length - 1); i++)
		{
			arr[i] = arr[i + 1];
		}
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		System.out.println("The updated array will be :");
		for(int i = 0; i < (arr.length - 1); i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}
}