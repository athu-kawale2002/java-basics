import java.util.*;
class oopprac9{
	public static void main(String ...args)
	{
		int arr[] = new int[5];
		System.out.println("Enter the elements in an array :");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("The elements in the given array are :");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i] + "\t");
		}
	}
}