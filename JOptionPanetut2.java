//JOptionPanetut2.java --HOMEWORK--
import javax.swing.JOptionPane;
class JOptionPanetut2
{
	public static void main(String args[])
	{
		int L = Integer.parseInt(JOptionPane.showInputDialog("Enter L"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Enter B"));
		
		int A = L*B;
		System.out.println("Area of rectangle is : "+A);
		
		int P = 2*(L+B);
		System.out.println("Perimiter of Rectangle is : "+P);
	}
}