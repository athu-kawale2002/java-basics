class recursivemethod
{
	public static void main(String ...args)
	{
		int x = fact(5);
		System.out.println("Fatoorial is "+x);
	}
	public static int fact(int n)
	{
		if (n == 1)
			return(1);
		else 
			return(n * fact(n-1));
	}
}