import java.util.*;
class arrayproject1
{
	public static void main(String ...args)
	{
		int arr[] = {12, 13, 14, 15, 16};
		int brr[] = {1, 2, 3, 4, 5};
		for(int j = 0; j<brr.length; j++)
		{
			arr[0] = brr[j];
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				System.out.println(arr[i]);
				sum = sum+arr[i];
			}
			int krr[] = new int[5];
			for(int k = 0; k<krr.length; k++)
			{
				krr[k] = sum;
			}
			Arrays.sort(krr);  
			System.out.println(krr);  
		}
	}
}