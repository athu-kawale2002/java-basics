//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
class practiceifelse1
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of the length and the bredth ");
		int L = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		if(L == B)
			System.out.print("it is an Square ");
		else
			System.out.print("it is an Rectangle ")
	}
}