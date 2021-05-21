class unittest1
{
	public static void main(String ...args)
	{
		int sum = 0;
		for(int i=1; i<=30; i+=2)
		{
			System.out.println(i);
			// if(i%2!=0)
			sum = sum + i;
		}
		System.out.println("The sum of first 30 odd no's is:"+sum);
	}
}