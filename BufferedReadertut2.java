//BufferedReadertut2.java
import java.io.*;
class BufferedReadertut2
{
	public static void main(String ...args)
	{
		try
		{
			BufferedReader athu = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Length of rectsngle :");
			int L = Integer.parseInt(athu.readLine());
			System.out.print("Enter Length of Rectangle :");
			int B = Integer.parseInt(athu.readLine());
			athu.close();
			int A = L*B;
			System.out.println("Area of rectangle is :"+A);
			int P = 2*(L+B);
			System.out.println("Perimiter of Rectangle is :"+P);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}