import java.util.*;
class throwexception{
	public static void main(String ...args){
		try{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b == 0){
			throw new ArithmeticException("Cannot divide by Zero");
		}
		else{
			int z = a%b;
			System.out.println("The quotient is :"+z);
		}
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		
	}
}