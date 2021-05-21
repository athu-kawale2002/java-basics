//program to print the sum of digits of the no:
import java.util.Scanner;
class while1
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int s = 0;
		int n = scan.nextInt();
		whille(n>0)
		{
			int x = n%10;
			s = s + x;
			n = n/10;
		}
	}
}