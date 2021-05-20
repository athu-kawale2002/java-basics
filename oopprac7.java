class Sum
{
	public void sum(int a, int b)
	{
		int s = a+b;
		System.out.println("The sum of two numbers is :"+s);
	}
	public void sum(int p, int q, int r)
	{
		int y = p+q+r;
		System.out.println("The sum of the three nos is :"+y);
	}
	public void sum(int u, int v, int w, double x)
	{
		double m = u+v+w+x;
		System.out.println("The sum of the given elements is :"+m);
 	}
}
class oopprac7
{
	public static void main(String ...args)
	{
		Sum a = new Sum();
		a.sum(5,7);
		a.sum(56,33,78);
		a.sum(55,23,12,2.5);
	}
}