public class Inheritance1 extends Inheritance
{
	Inheritance1()
	{
		asquare1=r*r;
		asquare=s*s;
		arectangle=l*b;
	}
	public void out()
	{
		super.out();
		System.out.println("The area of shape are:");
	}
	public static void main(String args[])
	{
		Inheritance1 a=new Inheritance1();
		a.out();
	}
}