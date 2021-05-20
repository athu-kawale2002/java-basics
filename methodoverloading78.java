class Box{
	private int L, B, H;
	public void setData(int a, int b, int c)
	{
		L = a;
		B = b;
		H = c;
	}
	public void setData(int p)
	{
		L = B = H = p;
	}
	public void showData()
	{
		System.out.println("The Length is "+L+"The breadth is "+B+"The heigth is "+H);
	}
	public int convert()
	{
		return(L*B*H);
	}
}
class methodoverloading78{
	public static void main(String ...args)
	{
		Box obj = new Box();
		obj.setData(5, 6, 7);
		obj.showData();
		int x = obj.convert();
		System.out.println("The Volume of the Box is :"+x);
		
		Box obje = new Box();
		obje.setData(5);
		obje.showData();
		int y = obje.convert();
		System.out.println("The Volume of the Box is :"+y);
	}
}