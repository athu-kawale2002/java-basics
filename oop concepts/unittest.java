class Sum{
	private int A;
	public Sum(int a)
	{
		A = a;
	}
	public int getsum()
	{
		int s = 0;
		for(int i=1;i<=A;i++)
		{
			if(i%2!=0)
			s = s +i;
		}
		return(s);
	}
}
class unittest
{
	public static void main(String ...args)
	{
		Sum a = new Sum(30);
		int x = a.getsum();
		System.out.println("The sum of first 30 odd no's is:"+x);
	}
}