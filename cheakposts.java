import java.util.*;
class cheakposts{
	public static void main(String ...args){
		Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int x = scan.nextInt();
			int arr[] = new int[n];
			int sum = 0;
			int sum1 = 0;
			int count = 0;
			int count1 = 0;
			for(int i = 0; i<n; i++){
				arr[i] = scan.nextInt();
				if(arr[i] == 0){
					sum = sum + (i+1);
					count++;
				}
				if(arr[i] == 1){
					if(count>x){
						sum1 = sum1+(i+1)+count-x;
					}
					sum1 = sum1+(i+1);
					count1 = count;
					count1++;
				}
			}
			if(sum!=0 && sum1==0){
				System.out.println(sum);
			}
			if(sum1!=0){
				if(n<count1){
					System.out.println((sum1+(n-count1))/2);
				}
				System.out.println(sum1);
			}
	}
}