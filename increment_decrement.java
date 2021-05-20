//arithmatic operators
class increment_decrement
{
	public static void main(String args[])
    {
		int a = 5, b = 7;
		int c = a++ + b++;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		c = ++a + --b;
		System.out.println("\n a ="+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		c = --a + b++;
		System.out.println("\n a = "+a);
		System.out.println("b  = "+b);
		System.out.println("c = "+c);
	}
}