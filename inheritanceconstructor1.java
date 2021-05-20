class Base{
	public Base(){
		System.out.println("This is derived class constructor:");
	}
}
class Derived extends Base{}
class inheritanceconstructor1
{
	public static void main(String ...args)
	{
		Derived a = new Derived();
	}
}