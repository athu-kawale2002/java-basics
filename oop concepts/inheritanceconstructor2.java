class Base{
	public Base(){
		System.out.println("This is Base class constructor:");
	}
}
class Derived extends Base{
	public Derived(int a){
		System.out.println("This is the Derived class constructor:");
	}
}
class inheritanceconstructor2
{
	public static void main(String ...args){
		Derived a = new Derived(10);
	}
}