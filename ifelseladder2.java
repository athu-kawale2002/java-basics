//WAP to read three numbers and find greatest of them
import java.util.Scanner;
class ifelseladder2
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a == b && b==c && c==a)
		System.out.println("no's are equal");
		else
		{
			if(a>b && a>c)
			System.out.println("a iss greatest");
			else
				if(b>c)
					System.out.println("b is greatest");
				else
					System.out.println("c is greatest");
		}
	}
}