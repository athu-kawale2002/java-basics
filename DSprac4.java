class DSprac4
{
	public static void main(String ...args)
	{
		int arr[] = {1, 2, 3, 4, 54, 5, 4};
		int item = 54;
		int loc = 0; 
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == item)
			{
			System.out.println("The location of the item is :"+i);
			}
		}
	}
}