//tutscannercircle.java
import java.util.Scanner;
class tutscannercircle
{
	public static void main(String ...args)
	{
		//fully qualified class name -- java.utill.Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Radius of the Circle: ");
		int R = scan.nextInt();
		scan.close();
		
		double A = 3.14*R*R ; //to print in float -- float A = 3.14f*R*R
		System.out.println("Area of Circle is: "+A);
		
		double C = 2*3.14*R ; //to print in float -- float C = 2*3.14F*R
		System.out.println("Circumference of Circle is: "+C);
	}
}