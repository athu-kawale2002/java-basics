import java.util.Scanner;
class nestedifelse
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number ");
		int a = scan.nextInt();
		scan.close();
		if(a > 0)
		{
			System.out.print("it is an positive number ");
			if(a % 2 == 0)
				System.out.print(" and it is an even number also ");
			else
				System.out.print(" and it is not an even number ");
		}
		else
			System.out.print("it is an negative number ");
	}
}