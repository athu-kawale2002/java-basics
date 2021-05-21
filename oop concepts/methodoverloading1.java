class methodoverloading1
{
	public static void main(String ...args)
	{
		int z = mult(2,3,4,5);
		System.out.println("z = "+z);
		
		int x = mult(2,4,5);
		System.out.println("x = "+x);
		
		int a = mult(2,3);
		System.out.println("a = "+a);
	}
	public static int mult(int n, int m, int l, int k)
	{
		return(n*m*l*k);
	}
	public static int mult(int m, int n, int l)
	{
		return(m*n*l);
	}
	public static int mult(int a, int b)
	{
		return(a*b);
	}
}