import java.util.Scanner;
class array1
{
	public static void main(String ...args)
	{
		int a[] = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i = 0; i<a.length; i++) 
		a[i] = scan.nextInt();
		scan.close();
		
		System.out.println("The array elements are:");
		for(int i = 0; i<a.length; i++)
		System.out.println(a[i] + " ");
		
	}
}