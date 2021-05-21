//Design a class circle with data member R. Define methods setRadius(), area(), and circumference()
class Circle
{
	private int R;
	public void setRadius(int n)
	{
		R = n;
	}
	public void area()
	{
		double A = 3.14*R*R;
		System.out.println("The area of the circle is"+A);
	}
	public void circumference()
	{
		double C = 2*3.14*R;
		System.out.println("The circumference of the circle is"+C);
	}
}
class example3
{
	public static void main(String ...args)
	{
		Circle obj = new Circle();
		obj.setRadius(67);
		obj.area();
		obj.circumference();
	}
}