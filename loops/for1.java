import java.util.Scanner;
class for1
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int even_count = 0, odd_count = 0;
		System.out.println("Enter the no of test cases");
		int no = scan.nextInt();
		for(int i=1; i <= no; i++)
		{
			System.out.println("Enter the number : ");
			int n = scan.nextInt();
			
			if(n%2==0)
				even_count++;
			else
				odd_count++;
		}
		System.out.println("Even count : "+even_count);
		System.out.println("Odd count : "+odd_count);
	}
}