class Stringbuffer12
{
	public static void main(String ...args)
	{
		StringBuffer a = new StringBuffer();
		System.out.println("a = "+a);
		System.out.println("Capacity = "+a.capacity());
		
		a.append("A");
		a.append("B");
		System.out.println("a = "+a);
		System.out.println("Capacity = "+a.capacity());
		
		for(int i = 97; i<=112; i++)
		a.append((char)i);
		
		System.out.println("a = "+a);
		System.out.println("Capacity = "+a.capacity());
	}
}