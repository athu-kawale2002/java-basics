class Circle
{
	private int R;
	public Circle(int r)
	{
		R = r;
	}
	public Circle(){}
	public void area()
	{
		double x = R*3.14*R;
		System.out.println(+x);
	}
	public void circumferareance()
	{
		double y = 2*3.14*R;
		System.out.println(+y);
	}
}
class constructoroverloading92
{
	public static void main(String ...args)
	{
		Circle a = new Circle(9);
		a.area();
		a.circumferareance();
		
		Circle b = new Circle();
		b.area();
		b.circumferareance();
		
	}
}