import java.io.Console;
class console1
{
	public static void main(String ...args)
	{
		Console con = System.console();
		System.out.print("Enter the 1st Number :");
		int a = Integer.parseInt(con.readLine());
		System.out.print("Enter the 2nd Number :");
		int b = Integer.parseInt(con.readLine());
		
		int c = a + b ;
		System.out.print("Sum is "+c);
	}
}