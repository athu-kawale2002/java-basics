import java.util.Scanner;
class switchcase1
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1-ENG\n2-HIN\n3-MAR");
		System.out.print("Enter valid input :");
		int n = scan.nextInt();
		scan.close();
		
		switch(n)
		{
			case 1:System.out.println("You have selected English");break;
			case 2:System.out.println("you have selected Hindi");break;
			case 3:System.out.println("You have selected marathi");break;
			default:System.out.println("Invalid input ...");break;
		}
	}
}