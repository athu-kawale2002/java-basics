class Person{
	protected int A;
	protected String N;
	public void setData(String n, int a)
	{
		A = a;
		N = n;
	}
	public void showData()
	{
		System.out.println("\nName= "+N);
		System.out.println("Age="+A+"years");
	}
}
class Citizen extends Person{
	protected String NAT;
	public void setData(String n, int a, String nat)
	{
		setData(n, a);
		NAT = nat;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Nationality= "+NAT);
	}
}
class Student extends Citizen{
	private int RN;
	private String D;
	public void setData(String n, int a, String nat, int rn, String d)
	{
		setData(n, a, nat);
		RN = rn;
		D = d;
	}
	public void showData(){
		super.showData();
		System.out.println("Roll no = "+RN);
		System.out.println("Department = "+D);
	}
}
class multilevelinheritance
{
	public static void main(String ...args)
	{
		Person a = new Person();
		a.setData("pappuu", 22);
		a.showData();
		
		Citizen b = new Citizen();
		b.setData("lallu", 22, "American");
		b.showData();
		
		Student c = new Student();
		c.setData("Athu", 18, "Indian", 31, "CSE");
		c.showData();
	}
}