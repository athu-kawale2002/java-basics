class Person{
	protected String N;
	protected int A;
	public void setData(String n, int a)
	{
		N = n;
		A = a;
	}
	public void showData()
	{
		System.out.println("The Name is :"+N);
		System.out.println("The Age is :"+A);
	}
}
class Citizen extends Person{
	private String NAT;
	public void setData(String n, int a, String nat)
	{
		N = n;
		A = a;
		NAT = nat;
	}
	public void showData()
	{
		System.out.println("The Name is :"+N);
		System.out.println("The Age is :"+A);
		System.out.println("The nationality is :"+NAT);
	}
}
class diffoverloadingnoverriding
{
	public static void main(String ...args)
	{
		Person a = new Person();
		a.setData("jack" , 22);
		a.showData();
		
		Citizen b = new Citizen();
		b.setData("james", 34 , "Indian");
		b.showData();
	}
}