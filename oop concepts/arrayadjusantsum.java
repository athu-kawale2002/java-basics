import java.util.*;
class arrayadjusantsum{
	public static void main(String ...args)
	{
		int arr[] = new int[5];
		System.out.println("Enter the elements in an array :");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<5; i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		int sum = 0;
		for(int i = 0; i<5; ++i){
			//int p = arr[i] - arr[i-1];
			int p = arr[i+1]-arr[i];
			sum = sum + p;
			//System.out.println(arr[i]);
		}
		System.out.println("The sum is: "+sum);
	}
}