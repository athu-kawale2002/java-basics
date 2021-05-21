class Distance{
	private int F, I;
	
	public Distance(int a, int b)
	{
		F = a;
		I = b;
	}
	public void showdata()
	{
		System.out.println("given data is "+F+"Feet"+I+"inches");
	}
	public int convert()
	{
		return(12*F+I);
	}
}

public class constuctor57
{
	public static void main(String ...args)
	{
		Distance a = new Distance(6,9);
		a.showdata();
		int x = a.convert();
		System.out.println("Data of obj-a is :"+x+"  inches");
	}
}