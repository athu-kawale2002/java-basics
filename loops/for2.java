//WAP to read a number and check the entered number is prime or not
import java.util.Scanner;
class for2
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int c = 0;
		scan.close();
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}	
		if (c == 2)
			System.out.println("-- the no is prime --");
		else
			System.out.println("-- the no is prime --");
	}
}