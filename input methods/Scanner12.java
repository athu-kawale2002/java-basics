//Scanner12.java
import  java.util.Scanner;
class Scanner12 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter L,B and H of a box :");
		int L = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		scan.close();
		
		int V = L*B*H;
		System.out.println("Volume of box is "+V);
		
		int S = 2*(L*B + B*H + H*L);
		System.out.println("Surface area of box is "+S);
	}
}