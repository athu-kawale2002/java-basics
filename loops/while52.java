//WAP to cheak the given no is armstrog or not
import javax.swing.*;
class while52
{
	public static void main(String ...args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number :"));
		int m = n ;
		int s = 0;
		while(n>0)
		{
			int x = n%10;
			s = s + (x*x*x);
			n = n/10;
		}
		if(s  == m)
		System.out.println("It is an Armstrong number :");
		else 
		System.out.println("It is not an Armstrong number :");
	}
}