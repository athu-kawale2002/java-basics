import java.util.Scanner;
class dowhile
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int s = 0, n;
		do
		{
			System.out.println("Enter a no : ");
			n = scan.nextInt();
			s = s+n;	
		}
		while(n>0);
		
		System.out.println("Sum is : "+s);
	}
}