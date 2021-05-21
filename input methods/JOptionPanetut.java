//JOptionPanetut.java
import javax.swing.JOptionPane;
class JOptionPanetut
{
	public static void main(String args[])
	{
		String x = JOptionPane.showInputDialog("Enter 1st number");
		String y = JOptionPane.showInputDialog("Enter 2nd number");
		String z = x + y;
		System.out.println("z = "+z);
	}
}