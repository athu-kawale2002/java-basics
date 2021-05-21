// Write a program to traverse an array and find the sum and average of data from an array.
class DSprac2
{
	public static void main(String ...args)
	{
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0; 
		for(int i = 0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The sum of the elements in an array is :"+sum);
		int ave = sum/arr.length;
		System.out.println("The average of the elements in an array is :"+ave);
	}
}