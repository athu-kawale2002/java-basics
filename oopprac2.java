import java.util.Scanner;
class oopprac2{
	public static void main(String ...args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers here:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		//arithmatic operators
		int c=a+b;
		System.out.println("c ="+c);
		
		int d = a-b;
		System.out.println("c ="+d);
		
		int e = a*b;
		System.out.println("c ="+e);
		
		double f = a/(double)b ;
        System.out.println("c ="+f) ;
			
		int x = 29 , y = 10;
		int z = x%y;
		System.out.println("z ="+z);

		//increment decrement operators
		a++ ;
		System.out.println("a ="+a) ;
		b-- ;
		System.out.println("b ="+b) ;
	}
}