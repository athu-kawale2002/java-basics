//WAP to find it's  reverse
import javax.swing.JOptionPane;
class while51
{
	public static void main(String ...args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a numaber : "));
		int m = n;
		int rev = 0;
		while(n>0)
		{
			int x = n%10;
			rev = rev*10 + x;
			n = n/10;
		}
		System.out.println("The reverse of the Given no is :"+rev);
		if(rev == m)
		System.out.println("It is palindrome !");
		else
		System.out.println("It is not a palindrome ! ");
	}
}