class Distance{
	private int F, I;
	public void setData(int f , int i)
	{
		F = f;
		I = i;
	}
	public void showData()
	{
		System.out.println(F+"Feet"+I+"Inches");
	}
}
class callbyreference{
	public static void main(String ...args)
	{
		Distance d = new Distance();
		d.setData(5, 2);
		d.showData();
		System.out.println("d = "+d);
		change(d);
		d.showData();
	}
	public static void change(Distance a)
	{
		System.out.println("a = "+a);
		a.setData(9, 34);
	}
}

