class method2
{
	public static void main(String ...args)
	{
		line(20); //Here 20 is actual argument
		System.out.println("Welcome to compilers");
		line(15);
		System.out.println("Rajapeth");
		line(10);
	}
	
	public static void line(int n) // Here variable  n is formal argument
	{
		for(int i = 1; i<=n; i++)
			System.out.print("*.");
			System.out.println();
	}
}