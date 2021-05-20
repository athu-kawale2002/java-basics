import java.util.*;
class oopprac3
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = 1;
		for(int i = 1; i<=n; i++)
			s = s*i;
		System.out.println("The factorial of the given no is:"+s);
	}
}