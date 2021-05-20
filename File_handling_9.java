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
class File_handling_9{
	public static void main(String ...args){
		try{
			person a = new person("Atharva", 33);
			person b = new person("Samiksha", 45);
			FileOutputStream fout = new FileOutputStream("E:/yash/FileOutputStream.dat");
			ObjectOutputStream dout = new ObjectOutputStream(fout);
			dout.writeObject(a);
			dout.writeObject(b);
			
			fout.close();
			dout.close();
			
			System.out.println("data processed.....");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}