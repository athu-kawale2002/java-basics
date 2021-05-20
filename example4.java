//Design a class Distance with data members Feet and Inches. Define methods setdata(), showdata(), convert(), The convert method will return data of Distance object into inches.(1 feet = 12 inches)
class Distance
{
	private int FEET;
	private int INCH;
	public void setdata(int a, int b)
	{
		FEET = a;
		INCH = b;
	}
	public void showdata()
	{
		System.out.println("The Distance of the object is "+FEET+" feet and "+INCH+" inches");
	}
	public int convert()
	{
		return (FEET*12 + INCH);
	}
}
class example4
{
	public static void main(String ...args)
	{
		Distance obj = new Distance();
		obj.setdata(89,33);
		obj.showdata();
		int x = obj.convert();
		System.out.println("The conversion will be:"+x+" inches");
	}
}