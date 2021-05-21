class mrthod3
{
	public static void main(String ...args)
	{
		double a = area(5.2);
		System.out.println("Area of circle is :"+a);
		double c = circumfeareance(5.4);
		System.out.println("Circumfeareance is :"+c);
	}
	public static double area(double r)
	{
		return(3.14*r*r);
	}
	
	public static double circumfeareance(double r)
	{
		return(2*3.14*r);
	}
}