import java.util.Scanner;
class ifelse2
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number ");
		int a = scan.nextInt();
		scan.close();
		if(a % 2 == 0)
			System.out.print("it is an even number ");
		else
			System.out.print("it is not an even number ");
		
	}
}