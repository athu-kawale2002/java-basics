//WAP to read a number and cheak it is zero or negative number
import java.util.Scanner;
class ifelseladder
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a valueof no:");
		int a = scan.nextInt();
		if(a == 0)
		{
			System.out.println("the given no is zero");
		}
		else
		{
			if(a>0)
			System.out.println("The given no is positve");
			else
				System.out.println("the given no is negative");
		}
	}
}