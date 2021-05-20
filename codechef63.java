/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class codechef63
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n = scan.nextInt();
		    while(n-->0)
		    {
		        String fname = scan.nextLine();
		        String lname = scan.nextLine();
		        System.out.println(+fname);
		    }
		}
		
	}
}