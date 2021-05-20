//WAP to read a number is even then print all even no up to that no , If the no is odd then print all no's up to that no.
import java.util.Scanner;
class for3
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = scan.nextInt();
		scan.close();
		
		int i = 0;
		if (n%2==0)
			i=2;
		else
			i=1;
		
		for ( ; i<=n ; i+=2)
			System.out.print(i+" ");
	}
}