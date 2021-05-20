import java.util.Scanner;
class ifelse4
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the three angles of the triangle ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		if((a+b+c == 180) && (a==b || b==c || c==a))
			System.out.print("it is an isosceles triangle ");
		else 
			System.out.print("it is not an isosceles triangle ");
	}
}