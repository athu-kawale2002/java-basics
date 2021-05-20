interface MyInterface{
	void add();
}
interface MyInterface2{
	void sub();
}
class Alpha implements MyInterface, MyInterface2{
	private int A, B;
	public Alpha(int a , int b){
		A = a;
		B = b;
	}
	public void add(){
		int X = A + B;
		System.out.println("The sum is :"+X);
	}
	public void sub(){
		int X = A - B;
		System.out.println("The substraction is :"+X);
	}
}
class multipleiheritanceinterfaces{
	public static void main(String ...args){
		Alpha a = new Alpha(32, 34);
		a.add();
		a.sub();
	}
}