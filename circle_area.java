//circle_area.java...........Method(function) overloading example.....
class circle_area
{
	int length , breath , side;
	float pi = 3.1428f , radius;
	void area(float r)
	{
		radius = r;
		float a = pi*radius*radius;
		System.out.println("The area of circle is : "+a);
	}
	void area(int l, int b)
	{
		length = l;
		breath = b;
		int a1 = length*breath;
		System.out.println("Area of rectangle is : "+a1);
	}
	void area(int s)
	{
		side = s;
		int a2 =side*side;
		System.out.println("Area of square is : "+a2);
	}
	public static void main(String ...args)
	{
		circle_area c1 = new circle_area();
		c1.area(10.0f);
		circle_area c2 = new circle_area();
		c2.area(5,7);
		circle_area c3 = new circle_area();
		c3.area(10);
	}
}