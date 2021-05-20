class Circle{
	private int R;
	private static double PI=3.1416;
	
	public Circle(int r)
	{
		R = r;
	}
	public void area()
	{
		double A = PI*R*R;
		System.out.println("area is"+A);
	}
	public void circumfeareance()
	{
		double C = 2*PI*R;
		System.out.println("circumfeareance is"+C);
	}
	public static void showPI()
	{
		System.out.println("The value of pi is "+PI);
	}
}

class staticvariablesandfunction1
{
	public static void main(String ...args)
	{
		Circle a = new Circle(47);
		a.area();
		a.circumfeareance();
		
		Circle b = new Circle(57);
		b.area();
		b.circumfeareance();
		
		Circle.showPI();
	}
}