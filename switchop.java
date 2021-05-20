import java.util.Scanner;
class switchop
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.print("Enter an operator (+, -, *, /) :");
		// scan.nextLine();
		scan.skip("\r\n");
		String op = scan.nextLine();
		scan.close();
		double c = 0;
			
		switch(op)
		{
			case "+" : c = a+b;
				System.out.println("Addition is :"+c);
				break;
			case "-" : c = a-b;
				System.out.println("Substraction is :"+c);
				break;
			case "*" : c = a*b;
				System.out.println("Multiplication is :"+c);
				break;
			case "/" : c = a/(double)b;
				System.out.println("Division is :"+c);
				break;
			default : System.out.println("Invalid operator...");
		}
	}
}