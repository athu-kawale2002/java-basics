class example22
{
	public static void main(String ...args)
	{
		StringBuffer x  = new StringBuffer();
		System.out.println("Capacity = "+x.capacity());
		for(int i = 65; i<=82; i++)
		x.append((char)i);
		
		System.out.println("x  = "+x);
		System.out.println("Capacity  = "+x.capacity());
	}
}