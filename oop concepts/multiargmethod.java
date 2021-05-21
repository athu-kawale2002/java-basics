class multiargmethod
{
	public static void main(String ...args)
	{
		int z = sum(10,20,30,40);
		System.out.println("z = "+z);
	}
	public static int sum(Object ...a)
	{
		int s = 0;
		for(Object n : a)
			s = s + Integer.parseInt(n.toString());
		return(s);
	}
}