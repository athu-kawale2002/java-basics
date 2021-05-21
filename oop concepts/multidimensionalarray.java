import java.util.*;
class multidimensionalarray
{
	public static void main(String ...args)
	{
		int a[][];
		a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an array with 2,4 and 3 elements in each row respectively :");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			a[i][j] = scan.nextInt();
		}
		scan.close();
		System.out.println("the array is as follows :");
		
		for(int i = 0; i < a[i].length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			System.out.print(a[i][j]+"\t");
			
			System.out.println();
		}
	}
}