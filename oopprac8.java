class Distance
{
	private int F, I ;
	public Distance(int a, int b)
	{
		F = a;
		I = b;
	}
	public Distance(int p)
	{
		F = p;
		I = 0;
	}
	public Distance(){}
	public void showData()
	{
		System.out.println(F+"Feet"+I+"Inches");
	}
}
class oopprac8
{
	public static void main(String ...args)
	{
		Distance a = new Distance(5, 6);
		a.showData();
		
		Distance b = new Distance(5);
		b.showData();
		
		Distance c = new Distance();
		c.showData();
	}
}