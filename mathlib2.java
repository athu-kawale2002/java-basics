// write a java program to calculate the area and circumferacnce of a circle using math class
import java.util.*;
class mathlib2
{
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int n = scan.nextInt();
		scan.close();
		
		double A = Math.PI*n*n;
		System.out.println("Area of the circle is :"+A);
		
		double C = Math.PI*2*n;
		System.out.println("Circumference of the circle is :"+C);
	}
}