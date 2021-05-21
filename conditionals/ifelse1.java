import java.util.Scanner;
class ifelse1
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the age of the person ");
		int a = scan.nextInt();
		scan.close();
		if(a >=18 )
			System.out.print("you are eligible for voting ");
		else
			System.out.print("you are not eligible for voting ");
	}
}