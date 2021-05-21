class comline2
{
	public static void main(String ...args)
	{
		double r = Double.parseDouble(args[0]);
		
		double A = 3.14*r*r ;
		System.out.println("Area of circle is :"+A);
		
		double C = 2*3.14*r ;
		System.out.print("Circufearance is :"+C);
	}
}