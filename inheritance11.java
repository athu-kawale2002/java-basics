class Circle{
	protected int R;
	public void setRadius(int r)
	{
		R = r;
	}
	public void area()
	{
		//double A = 3.14*R*R;
		double B = Math.PI*R*R;
		System.out.println("The area of the circle is "+B);
	}
}
class MyCircle extends Circle
{
	public void circum()
	{
		double C = 2*Math.PI*R;
		System.out.println("The circumfeareace of the circle is :"+C);
	}
}
class inheritance11
{
	public static void main(String ...args)
	{
		Circle a = new Circle();
		a.setRadius(3);
		a.area();
		
		MyCircle b = new MyCircle();
		b.setRadius(7);
		b.area();
		b.circum();
	}
}