class Distance
{
	private int F, I;
	public void setData(int a, int b)
	{
		F = a;
		I = b;
	}
	public void setData(int a)
	{
		F = a;
	}
	public void showData()
	{
		System.out.println("The distance is "+F+"feet"+I+"inches");
	}
	public int convert()
	{
		return(12*F + I);
	}
}
class methodoverloading87
{
	public static void main(String ...args)
	{
		Distance obj = new Distance();
		obj.setData(5,7);
		obj.showData();
		int x = obj.convert();
		System.out.println("The distance is "+x);
		
		Distance obje = new Distance();
		obje.setData(5);
		obje.showData();
		int y = obje.convert();
		System.out.println("The distance is "+y);
	}
}