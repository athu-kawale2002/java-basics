class pattern2
{
	public static void main(String ...args)
	{
		for(int p=5, q=1; q<=5; p-- , q++)
		{
			for(int i = 1;i<=p;i++)
			System.out.print("-");
			
			for(int i = 1;i<=q;i++)
			System.out.print("* ");
			
			System.out.println();
		}
	}
}