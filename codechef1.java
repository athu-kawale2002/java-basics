import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    for (int i=0;i>t;i++)
	    {
	        int a = scan.nextInt();
	        int b= scan.nextInt();
	        if(a > b)
	        System.out.print(">");
	        else
	        {
	            if(a < b)
	            System.out.print("<");
	            else
	            System.out.print("=");
	        }
	    }
	}
}