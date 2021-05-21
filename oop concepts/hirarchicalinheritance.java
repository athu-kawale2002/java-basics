class Person{
	protected int A;
	protected String N;
	public void setData(String n, int a)
	{
		N = n; 
		A = a;
	}
	public void showData()
	{
		System.out.println("Name = "+N);
		System.out.println("Age is = "+A);
	}
}
class Student extends Person{
	private int RN;
	private String D;
	public void setData(String n, int a, int rn, String d){
		setData(n,a);
		RN = rn;
		D = d;
	}
	public void showData(){
		super.showData();
		System.out.println("Roll N0 is = "+RN);
		System.out.println("Department is = "+D);
	}
}
class Employee extends Person{
	private int EN;
	private String JOB;
	public void setData(String n, int a, int en, String job)
	{
		setData(n, a);
		EN = en;
		JOB = job;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Employee No is = "+EN);
		System.out.println("Job is = "+JOB);
	}
}
class hirarchicalinheritance{
	public static void main(String ...args)
	{
		Person a = new Person();
		a.setData("john sena", 24);
		a.showData();
		
		Student b = new Student();
		b.setData("babu", 22, 10101, "MBBS");
		b.showData();
		
		Employee c = new Employee();
		c.setData("bachu kadu", 58, 3232323, "import export");
		c.showData();
	}
}