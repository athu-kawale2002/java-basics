import java.util.*;
class vectorlclass
{
	public static void main(String ...args)
	{
		Vector <Integer> v = new Vector <Integer>();
		System.out.println("The elements in an vector are :"+v);
		System.out.println("The capacity of the vector is :"+v.capacity());
		System.out.println("The size of an array is :"+v.size());
		
		for(int i=1; i<=11; i++)
			v.add(i);
		
		System.out.println("The elements in an vector are :"+v);
		System.out.println("The capacity of the vector is :"+v.capacity());
		System.out.println("The size of an array is :"+v.size());
		
		v.add(2, 10489758);
		System.out.println("The element is added at index 2 :"+v);
 	}
}