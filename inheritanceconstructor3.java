class Base{
	protected String N;
	protected int A;
	public Base(String n, int a){
		A = a;
		N = n;
	}
	public void showData(){
		System.out.println("The name is :"+N);
		System.out.println("The Age is:"+A);
	}
}
class Derived extends Base{
	private String NAT;
	public Derived(String n, int a, String nat){
		super(n, a);
		NAT = nat;
	}
	public void showData(){
		super.showData();
		System.out.println("The nationality is:"+NAT);
	}
}
class inheritanceconstructor3{
	public static void main(String ...args){
		Base b = new Base("bala", 23);
		b.showData();
		
		Derived a = new Derived("lala", 10, "Nationality");
		a.showData();
	}
}