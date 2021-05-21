//WAP to find operators are used to cheak condition and return as per result
import java.util.Scanner;
class ternaryop
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = scan.nextInt();
		int b = scan.nex	tInt();
		scan.close();
		int s = a>b ? a : b;
		System.out.println("The greater no is :"+s);
	}
}