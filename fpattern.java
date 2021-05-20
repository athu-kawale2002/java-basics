class fpattern
{
	public static void main(String args[])
	{
		String pat="aaba";
		String text="aabaacaadaabaaabaa";
		int r=pat.length();
		int s=text.length();
		for(int i=0; i<=s-r; i++)
		{
			int j;
			for(j=0;j<r;j++)
			{
				if(text.charAt(i+j) != pat.charAt(j))
					break;
			}
			if(j==r)
			{
				System.out.println("Pattern found at index:"+i);
			}
		}
	}
}