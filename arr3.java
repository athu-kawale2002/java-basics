class arr3
{
	public static void main(String ...args)
	{
		int a [][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int x[] : a)
		{
			for(int y : x)
			System.out.print(y+" ");
			
			System.out.println();
		}
	}
}