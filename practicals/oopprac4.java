import java.util.*;
class oopprac4
{
	public static void main(String ...args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a == b && b==c && c==a)
		System.out.println("no's are equal");
		else
		{
			if(a>b && a>c)
			System.out.println("a is greatest");
			else
				if(b>c)
					System.out.println("b is greatest");
				else
					System.out.println("c is greatest");
		}
	}
}