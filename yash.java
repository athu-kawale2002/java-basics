//WAP to read a number and find the sum off it's digits.
import javax.swing.JOptionPane;
class yash
{
	public static void main(String ...args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number :"));
		int s = 0;
		while(n>0)
		{
			int x = n%10;
			s = s + x;
			n = n/10;
		}
		System.out.println("the sum of the digits is :"+s);
	}
}