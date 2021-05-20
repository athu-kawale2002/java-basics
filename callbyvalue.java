class callbyvalue
{
	public static void main(String ...args)
	{
		int z = 10;
		System.out.println(" z = "+z);
		square(z);
		System.out.println(" z = "+z);
	}
	public static void square(int z)
	{
		z = z*z;
		System.out.println(" z = "+z);
	}
}