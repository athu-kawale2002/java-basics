class Rectangle{
	private int L;
	private int B;
	public void setdata(int l, int b)
	{
		L = l; 
		B = b;
	}
	public void area()
	{
		int a = L*B;
		System.out.println("The area of the Rectangle is"+a);
	}
	public void perimeter()
	{
		int p = 2*(L+B);
		System.out.println("The perimeter of the rectangle is"+p);
	}
}
class example2
{
	public static void main(String ...args)
	{
		Rectangle a = new Rectangle();
		a.setdata(5,6);
		a.area();
		a.perimeter();
	}
}