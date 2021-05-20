class Box 
{
	private int L;
	private int B;
	private int H;
	public void setdata(int l, int b, int h)
	{
		L = l;
		B = b;
		H = h;
	}
	public void volume()
	{
		int v = L*B*H;
		System.out.println("The volume of the box is"+v);
	}
	public void surface_area()
	{
		int s = 2*(L*B + B*H + H*L);
		System.out.println("The surface area of the box is"+s);
	}
	
}

class example1
{
	public static void main(String ...args)
	{
		Box a = new Box();
		a.setdata(5,6,7);
		a.volume();
		a.surface_area();
	}
}