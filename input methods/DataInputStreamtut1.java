//DataInputStreamtut1.java
import java.io.*;
class DataInputStreamtut1
{
	public static void main(String ...args)
	{
		try
		{
			DataInputStream athu = new DataInputStream(System.in);
			System.out.println("Enter Length of the Rectangle :");
			int L = Integer.parseInt(athu.readLine());
			System.out.println("Enter Breadth of Rectangle :");
			int B = Integer.parseInt(athu.readLine());
			athu.close();
			
			int A = L*B;
			System.out.println("Area os Rectangle is :"+A);
			
			int p = 2*(L+B);
			System.out.println("Perimiter of the Rectangle is:"+p);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}