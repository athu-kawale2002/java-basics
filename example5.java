//Design a class Time with data members Hours and Minutes. Define methods setdata(), showdata(), and convert().The convert method will return data of the Time object into minutes(1 hour = 60 minutes)
class Time{
	private int H;
	private int M;
	public void setdata(int a, int b)
	{
		H = a;
		M = b;
	}
	public void showdata()
	{
		System.out.println("The Time given is "+H+" hours and "+M+" minutes");
	}
	public int convert()
	{
		return (H*60 + M);
	}
}
class example5
{
	public static void main(String ...args)
	{
		Time obj = new Time();
		obj.setdata(56,78);
		obj.showdata();
		int x = obj.convert();
		System.out.println("The conversion will be "+x+" Minutes");
	}
}