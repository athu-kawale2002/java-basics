class Circle 
{
	private int R;
	
	public Circle(int r)
	{
		R = r;
	}
	public void area()
	{
		double A = 3.14*R*R;
		System.out.println("Area is :"+A);
	}
	public void circumfearence()
	{
		double C = 2*3.14*R;
		System.out.println("Circumfearence is :"+C);
	}
}
public class constructor56
{
	public static void main(String ...args)
	{
		Circle a = new Circle(6);
		a.area();
		a.circumfearence();
		
		Circle b = new Circle(8);
		a.area();
		a.circumfearence();
	}
}