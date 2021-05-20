//DataInputStreamtut.java
import java.io.DataInputStream;
class DataInputStreamtut
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream din = new DataInputStream(System.in);
			System.out.print("Enter 1st Number :");
			int a = Integer.parseInt(din.readLine());
			System.out.print("Enter 2nd Number :");
			int b = Integer.parseInt(din.readLine());
			din.close();
			int c = a + b;
			System.out.println("c = "+c);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
} 