import java.util.*;
class Circle{
	public void area(int a)
	{
		double A = 3.14*a*a;
		System.out.println("The area of the circle is:"+A);
	}
	public void circumfeareance(int b)
	{
		double C = 2*3.14*b;
		System.out.println("The circumfeareance of the circle is :"+C);
	}
}
class oopprac6
{
	public static void main(String ...args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the cicle :");
		int n = scan.nextInt();
		Circle a = new Circle();
		a.area(n);
		a.circumfeareance(n);
	}
}