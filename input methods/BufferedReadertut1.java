//BufferedReadertut1.java
import java.io.*;
class BufferedReadertut1
{
	public static void main(String ...args)
	{
		try
		{
			BufferedReader athu = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Length off a box : ");
			int L = Integer.parseInt(athu.readLine());
			
			System.out.print("Enter Breadth of a Box : ");
			int B = Integer.parseInt(athu.readLine());
			
			System.out.print("Enter the Height of the box : ");
			int H = Integer.parseInt(athu.readLine());
			athu.close();
			
			int V = L*B*H;
			System.out.print("Volume of Box is :"+V);
			
			int P = 2*(L*B + B*H + L*H);
			System.out.print("\nSurface Area of Box is :"+P);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}