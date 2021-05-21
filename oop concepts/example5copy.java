class Time
{
	private int H;
	private int M;
	public void SetData(int a, int b)
	{
		H = a ;
		M = b ;
	}
	public void ShowData()
	{
		System.out.println("The time is "+H+"and"+M+"minutes");
	}
	public int Convert()
	{
		int b = (H*60+M);
		return b;
	}
}
class example5copy
{
	public static void main(String ...args)
	{
		Time obj = new Time();
		obj.SetData(23,78);
		obj.ShowData();
		int x = obj.Convert();
		System.out.println("The total time in minutes is:"+x);
	}
}