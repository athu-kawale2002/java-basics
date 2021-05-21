class oopprackai
{
	public void add(int a, int b, int c, int d, int e)
	{
		int sum =  a+b+c+d+e;
		System.out.println("The sum of the 5 no. is :"+sum);
	}
	public void add(int p, int q)
	{
		int sum =  p+q;
		System.out.println("The sum of the 2 no. is :"+sum);
	}
	public static void main(String ...args)
	{
		oopprackai a = new oopprackai();
		a.add(1,2,3,4,5);
		a.add(1,2);
	}
}