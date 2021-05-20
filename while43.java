//WAP to read an integer and find its factorial.
import javax.swing.JOptionPane;
class while43
{
	public static void main(String ...args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int i=1, f = 1;
		while(i <= n)
		{
			f = f * i;
			i++;
		}
		System.out.println("Factorial is :"+f);
	}
}