import java.util.Scanner;
class method7
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 different numbers :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		
		// int x = max(a , b);
		// int y = max(c , d);
		// int z = max(x ,y);
		int z = max(max(a,b) , max(c,d));
		System.out.println("Greatest is "+z);
	}
	public static int max(int p , int q)
	{
		if(p>q)
			return(p);
		else
			return(q);
	}
}