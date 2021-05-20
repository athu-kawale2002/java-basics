import java.io.*;
class person implements Serializable{
	private String N;
	private int A;
	public person(String n, int a){
		N = n;
		A = a;
	}
	public void Showdata(){
		System.out.println("The Name of the person is : "+N);
		System.out.println("The age of the person is : "+A);
	}
}
class File_handling_10{
	public static void main(String ...args){
		try{
			FileInputStream fin = new FileInputStream("E:/yash/FileOutputStream.dat");
			ObjectInputStream din = new ObjectInputStream(fin);
			
			person a = (person) din.readObject();
			person b = (person) din.readObject();
			a.Showdata();
			b.Showdata();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}