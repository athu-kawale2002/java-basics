class pattern3
{
	public static void main(String ...args)
	{
		for(int p=1,q=5;p<=5;p++,q--)
		{
			for(int i=1; i<=p; i++) //1 2 3 4 5
				System.out.print(" ");
			
			for(int i=1; i<=q; i++) //5 4 3 2 1
				System.out.print("* ");
				
			System.out.println();
		}
	}
}