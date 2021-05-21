import java.util.*;
class guvi{
	public static void main(String ...args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int c = scan.nextInt();
		int p = scan.nextInt();
		char arr[] = s.toCharArray();
		for(int i = 1; i<arr.length; i++){
			if(i%p==0 && c==1){
				//char a = arr[i];
				arr[i] = Character.toLowerCase(arr[i]);
				//arr[i] = a;
			}
			if(i%p==0 && c==2){
				//char a = arr[i];
				arr[i] = Character.toUpperCase(arr[i]);
				//arr[i] = a;
			}
		}
		String str = Arrays.toString(arr);
		System.out.println(str);
	}
}