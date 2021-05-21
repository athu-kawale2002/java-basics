class Student
{
	int RN;
	String N, D;
	
	void showData()
	{
		System.out.println("\nRoll number is :"+RN);
		System.out.println("Student Name is :"+N);
		System.out.println("Department is :"+D);
	}
}
class oop1
{
	public static void main(String ...args)
	{
		Student a = new Student();
		a.RN = 1111;
		a.N = "JACK";
		a.D = "CSE";
		
		Student b = new Student();
		b.RN = 2222;
		b.N = "Atharva";
		b.D = "IT";
		
		a.showData();
		b.showData();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}