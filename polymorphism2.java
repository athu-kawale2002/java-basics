abstract class Units{
	abstract public void showData();
	abstract public void convert();
}
class Distance extends Units{
	private int F, I;
	public Distance(int a, int b){
		F = a; 
		I = b;
	}
	public void showData(){
		System.out.println("The Distance is "+F+"Feet"+I+"Inches");
	}
	public void convert(){
		int C = F*12+I;
		System.out.println("The total distance in inches is :"+C);
	}
}
class Time extends Units{
	private int H, M;
	public Time(int a, int b){
		H = a; 
		M = b;
	}
	public void showData(){
		System.out.println("The Time is "+H+"Hours"+M+"Minutes");
	}
	public void convert(){
		int B = H*60+M;
		System.out.println("The total time in minutes is :"+B);
	}
}
class polymorphism2{
	public static void main(String ...args){
		Units a[] = new Units[5];
		a[0] = new Distance(7, 4);
		a[1] = new Time(3, 4);
		a[2] = new Distance(3,5);
		a[3] = new Time(1, 29);
		a[4] = new Distance(3, 4);
		//Polymorphic code
		for(int i = 0; i<a.length; i++)
		{
			a[i].showData();
			a[i].convert();
		}
	}
	
}