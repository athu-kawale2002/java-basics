package deadpool;
public class Distance{
	private int F, I;
	public Distance(int a, int b){
		F = a;
		I = b;
	}
	public void showData(){
		System.out.println("The distance is "+F+"feet"+I+"Inches");
	}
	public int convert(){
		int  Z = F*12+I;
		System.out.println("The total distance is :"+Z);
	}
}