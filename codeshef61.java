//codeshef61.java
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef61
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int a = scan.nextInt();
		    int c = 0;
		    while(a>0)
		    {
                int p = a % 10;
                if(p == 4)
                c++;
                a = a/10;
		    }
		    System.out.println(+c);
		}
	}
}
