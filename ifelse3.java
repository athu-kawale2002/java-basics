import java.util.Scanner;
class ifelse3
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the three angles of the triangle ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		if(a + b + c == 180)
			System.out.print("it is the triangle ");
		else
			System.out.print("it is not a triangle ");		
	}
}