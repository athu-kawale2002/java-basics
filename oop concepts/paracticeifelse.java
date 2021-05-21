import java.util.Scanner;
class paracticeifelse
{
	public static void main(String ...args)
	{
		int i = 1;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		while(i <= 5)
		{	
			int p = scan.nextInt();
			sum = sum + p;
			i++;
		}
		scan.close();
		System.out.println(+sum);
		//double per = (sum*100)/5.0;
		//System.out.println(+per);
	}
}
//