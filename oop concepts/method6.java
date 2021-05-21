import java.util.Scanner;
class method6
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int x = scan.nextInt();
		if(isEven(x))
			System.out.println("Given no is even no ");
		else
			System.out.println("Given no is odd no ");
	}
	public static boolean isEven(int n)
	{
		if(n % 2==0)
			return(true);
		else
			return(false);
	}
}