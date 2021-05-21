class Rectangle{
	protected int L, B;
	public void setData(int l, int b)
	{
		L = l;
		B = b;
	}
	public void area()
	{
		int A = L*B; 
		System.out.println("The Area of the Rectangle is :"+A);
	}	
}
class MyRectangle extends Rectangle{
	public void perimeter()
	{
		int P = 2*(L + B);
		System.out.println("The Perimeter of the Rectangle is :"+P);
	}
}
class inhertance13
{
	public static void main(String ...args)
	{
		Rectangle a = new Rectangle();
		a.setData(3, 5);
		a.area();
			
		MyRectangle b = new MyRectangle();
		b.setData(34, 44);
		b.area();
		b.perimeter();
	}
}