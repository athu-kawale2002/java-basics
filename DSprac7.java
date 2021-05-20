import java.util.*;
class DSprac7
{
	public static void main(String ...args)
	{
		int arr[] = {10, 60, 20, 40, 50};
		int p = 0;
		for(int i = 0; i<(arr.length-1); i++)
		{
			while(p<(arr.length-1)-i)
			{
				if(arr[p]>arr[p+1])
				{
					int c; 
					c = arr[p];
					arr[p] = arr[p+1];
					arr[p+1] = c;
				}
				p = p+1;
			}
		}
		System.out.println("|Sorted array is :"+Arrays.toString(arr));
	}
}