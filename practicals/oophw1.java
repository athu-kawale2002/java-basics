//Design a class Employee with data members Employee Number, Employee mehtods setdata() and showdata().
class Employee
{
	private int EN;
	private String Ename;
	private String job; 
	private int Sal;
	
	public void setdata(int en, String ename, String j, int sal)
	{
		EN = en;
		Ename = ename;
		job = j;
		Sal = sal;
	}
	public void showdata()
	{
		System.out.println("Employee number :"+EN);
		System.out.println("Employee name :"+Ename);
		System.out.println("Employee Job :"+job);
		System.out.println("Employee Salary :"+Sal);
	}
}
class oophw1
{
	public static void main(String ...args)
	{
		Employee obj = new Employee();
		obj.setdata(1010, "William", "Maneger", 25000);
		obj.showdata();
	}
}