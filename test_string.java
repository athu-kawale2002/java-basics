/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class index{
	public int index(int[] a, int k)
	{
		int[] A = a;
		int K = k;
	}
	public int cheak(){
		int inde = 0;
		for(int j=9; j>=0; j--){
			if(K>=A[j]){
				K = K-A[j];
				inde = j;
			}
			else
				inde = j;
				break;
			}
		}
			System.out.println(inde+1(int));
	}
}
class test_string
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0; i<t; i++)
	    {
			int a[]= new int[10];
	        for(int j=0; j<10; j++)
	        {
	            a[j]=sc.nextInt();
	        }
	        int x=sc.nextInt();
			index i = new index(a, x);
			i.cheak();
		//	System.out.println(i);
	    }
	}
}