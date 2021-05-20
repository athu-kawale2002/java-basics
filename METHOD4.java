import java.util.Scanner;
class METHOD4
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the amount of the work and the working days off the 1st worker : ");
		int w = scan.nextInt();
		int wb = scan.nextInt();
		System.out.println("give the amount of the work and the working days of 2nd worker");
		int w1 = scan.nextInt();
		int wb1 = scan.nextInt();
		
		int p = payment(w , wb);
		System.out.println("Payment of 1st worker is "+p);
		
		int p1 = payment(w1 , wb1);
		System.out.println("Payment of 2nd worker is "+p1);
		
		int total_payment = p + p1;
		System.out.println("Total payment is "+total_payment);
		
	}
	public static int payment(int w , int wb)
	{
		return(w*wb);
	}
}