import java.util.Scanner;
class fibonacci
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1 ,j = 1;
		
		if (n>=1)
			System.out.print(i+" ");
		
		if (n>=2)
			System.out.print(j+" ");
		
		if (n>=3)
		{
			int k = 3; 
			while(k<=n)
			{
				int x = i+j;
				System.out.print(x+" ");
				i = j;
				j = x;
				k++;
			}
		}
	}
}