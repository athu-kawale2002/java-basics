/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pipi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    scan.nextLine();
		    String s = scan.nextLine();
		    s.toLowerCase();
		    int count = 0;
		    int j = 0;
		    for(int i = 0;i<n; i++){
		        if(s.charAt(i) == '*')
		        count++;
		        else
		        count = 0;
		        j = i;
		        if(count>=k)
		        System.out.println("yes");
		        break;
		    }
		    if(j==n)
		    System.out.println("no");
		}
	}
}