class Distance{
	protected int F, I;
	public void setData(int f, int i)
	{
		F = f;
		I = i;
	}
	public void showData()
	{
		System.out.println(F+"Feet"+I+"Inches");
	}
}
class MyDistance extends Distance
{
	public void convert()
	{
		int C = F*12+I;
		System.out.println("The Conversion of feet into inches is :"+C);
	}
}
class inheritance12{
	public static void main(String ...args)
	{
		Distance a = new Distance();
		a.setData(2, 3);
		a.showData();
	
		MyDistance b = new MyDistance();
		b.setData(12, 33);
		b.showData();
		b.convert();
	}
}
