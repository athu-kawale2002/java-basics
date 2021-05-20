import java.util.Scanner;
class dowhile2
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int even_sum = 0, odd_sum = 0;
		int n;
		
		do
		{
			System.out.print("Enter a number : ");
			n = scan.nextInt();
			
			if (n%2==0)
				even_sum += n;
			else
				odd_sum += n;
		}
		while(n>0);
		
		System.out.println("Sum of even numbers = "+even_sum);
		System.out.println("Sum of odd numbers = "+odd_sum);
	}
}