import java.util.*;
class a_sequence_series{
	public static void main(String ...args){
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		double sum = 0, sum1 = 0;
		int a = 1;
		for(int m = i; m<=j; m++){
			sum = sum + m;
		}
		//System.out.println(sum);
		sum1 = sum;
		for(int n = j; n>k; n--)
		{
			sum1 = sum1 + (n-1);
		}
		System.out.println(sum1);
	}
}