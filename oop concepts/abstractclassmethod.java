abstract class Rectangle{
	protected int L, B;
	public Rectangle(int a, int b){
		L = a;
		B = b;
	}
	public void area(){
		int A = L*B;
		System.out.println("The area is = "+A);
	}
	abstract public void perimeter();
}
class MyRectangle extends Rectangle{
	public MyRectangle(int a, int b){
		super(a, b);
	}
	@Override
	public void perimeter(){
		int p = 2*(L+B);
		System.out.println("The perimeter is = "+p);
	}
}
class abstractclassmethod{
	public static void main(String ...args){
		MyRectangle b = new MyRectangle(7, 8);
		b.area();
		b.perimeter();
	}
}