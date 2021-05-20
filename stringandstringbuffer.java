class StringnStringBuffer1234 
{
	public static void main(String ...args)
	{
		String x = "amravati";
		String y = x.replace("a" , "@");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		StringBuffer a = new StringBuffer("Laxmikant");
		StringBuffer b = a.replace(0, 5, "Rama");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}