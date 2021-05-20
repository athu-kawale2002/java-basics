import javax.swing.JOptionPane;
class Person
{
	private String N;
	private int A;
	public void setData()
	{	
	N = JOptionPane.showInputDialog("Enter your name -->");
	A = Integer.parseInt(JOptionPane.showInputDialog("Enter your age -->"));
	}
	public void showData()
	{
		System.out.println("The name of the person is "+N+"\thaving Age"+A);
	}
}
public 
class aarrayofobject
{
	public static void main(String ...args)
	{
		Person a[] = new Person[5];
		for(int i = 0; i<a.length; i++)
		{
		a[i] = new Person();
		a[i].setData();
		a[i].showData();
		}
	}
}