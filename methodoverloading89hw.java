class Rectangle{
	private int L, B;
	public void setData(int a, int b)
	{
		L = a;
		B = b;
	}
	public void setData(int p)
	{
		L = B = p;
	}
	public void showData()
	{
		System.out.println("The Box is having length"+L+"and Breadth"+B);
	}
	public int convert()
	{
		return(L*B);
	}
}
class methodoverloading89hw
{
	public static void main(String ...args)
	{
		Rectangle obj = new Rectangle();
		obj.setData(5,6);
		obj.showData();
		int x = obj.convert();
		System.out.println("The area of the box is :"+x);
		
		Rectangle obje = new Rectangle();
		obje.setData(5);
		obje.showData();
		int y = obje.convert();
		System.out.println("The area of the box is :"+y);
	}
}