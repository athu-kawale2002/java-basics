class Person{
	private String N; 
	private int A;
	public Person(String n, int a)
	{
		N = n;
		A = a;
	}
	public void showData()
	{
		System.out.println("The name of the person is "+N+"\thaving age :"+A);
	}
}
class arrayofobjects2
{
	public static void main(String ...args)
	{
		Person a[] = {new Person("Atharva", 18), new Person("sandy", 133), new Person("cooly", 39), new Person("randy", 29)};
		for(int i = 0; i<a.length; i++)
		a[i].showData();
	}
}