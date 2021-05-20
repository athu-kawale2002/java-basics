class Base{
	public void m1(){
		System.out.println("I am the Base class method m1");
	}
	public void m2(){
		System.out.println("I am the Base class method m2");
	}
}
class Derived extends Base{
	@Override
	public void m1(){
		System.out.println("This is the derived class method m1");
	}
	public void m3(){
		System.out.println("This is the Derived class method m3");
	}
}
class polymorphism1{
	public static void main(String ...args){
		Base a = new Derived();//vaild
		a.m1();//vaild because m1()is an overrided method
		a.m2();//vaild because m2() is an inherited method
		//a.m3;   Invaild because m3() is not an inherited or overrided method
	}
}