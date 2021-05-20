class methodoverloading2
{
	public static void main(String ...args)
	{
		display(10);
		display(4.4);
	}
	public static void display(int n)
	{
		System.out.println("int n ="+n);
	}
	public static void display(double n)
	{
		System.out.println("double n ="+n);
	}
}