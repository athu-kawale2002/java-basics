import java.util.Scanner;
class method5
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the inner circle");
		int r1 = scan.nextInt();
		System.out.println("Enter the radius of the outer circle");
		int r2 = scan.nextInt();
		scan.close();
		
		// double x = area(r1);
		// double y = area(r2);
		// double z = x - y;
		double z = area(r1) - area(r2);
		System.out.println("Area of lined portion is "+z);
	}
	public static double area(int r)
	{
		return(3.14*r*r);
	}
}